package com.gb.controller;

import com.gb.exception.InvalidTokenException;
import com.gb.exception.InvalidWorkerNoException;
import com.gb.exception.NoPermissionException;
import com.gb.info.Message;
import com.gb.mapper.MappingMapper;
import com.gb.mapper.MatchMapper;
import com.gb.mapper.TokenMapper;
import com.gb.mapper.WorkerMapper;
import com.gb.po.*;
import com.gb.util.JwtUtils;
import com.gb.util.StringUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@SuppressWarnings("Duplicates")
@RestController("workerController")
@RequestMapping("v1/workers")
public class WorkerController {
    private static final long TOKEN_TIME_TO_LIVE = 1000 * 60 * 60 * 24;

    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    WorkerMapper workerMapper = ac.getBean("workerMapper", WorkerMapper.class);
    TokenMapper tokenMapper = ac.getBean("tokenMapper", TokenMapper.class);
    MappingMapper mappingMapper = ac.getBean("mappingMapper", MappingMapper.class);


    @PostMapping
    public Message registerWorker(@RequestBody Worker worker, HttpServletResponse response) {

        //判断账号是否存在
        Worker w = workerMapper.selectByPrimaryKey(worker.getWorkerNo());
        if (w != null) {
            response.setStatus(403);
            return new Message(403, "账号已经存在");
        }

        //手机号长度和格式判断
        if (worker.getPhone().length() != 11 || !StringUtils.isDigitsOnly(worker.getPhone())) {
            response.setStatus(403);
            return new Message(403, "手机号格式错误");
        }

        //邮箱格式判断
        if (!StringUtils.isEmailFormat(worker.getEmail())) {
            response.setStatus(403);
            return new Message(403, "邮箱格式错误");
        }

        //身份证号长度和格式判断
        if (worker.getIdCard().length() != 18 || !StringUtils.isDigitsOnly(worker.getIdCard())) {
            response.setStatus(403);
            return new Message(403, "身份证号格式错误");
        }

        //判断工号是否存在
        MatchMapper matchMapper = (MatchMapper) ac.getBean("matchMapper");
        MatchExample matchExample = new MatchExample();
        MatchExample.Criteria mc = matchExample.createCriteria();
        mc.andWorkerNoEqualTo(worker.getWorkerNo());
        List<Match> ml = matchMapper.selectByExample(matchExample);
        if (ml.size() == 0) {
            response.setStatus(403);
            return new Message(403, "工号不存在，注册失败");
        }

        //判断手机号是否重复
        WorkerExample we1 = new WorkerExample();
        WorkerExample.Criteria wc1 = we1.createCriteria();
        wc1.andPhoneEqualTo(worker.getPhone());
        List<Worker> workerList1 = workerMapper.selectByExample(we1);
        if (workerList1.size() > 0) {
            response.setStatus(403);
            return new Message(403, "手机号已经被注册");
        }

        //判断邮箱是否重复
        WorkerExample we2 = new WorkerExample();
        WorkerExample.Criteria wc2 = we2.createCriteria();
        wc2.andEmailEqualTo(worker.getEmail());
        List<Worker> workerList2 = workerMapper.selectByExample(we2);
        if (workerList2.size() > 0) {
            response.setStatus(403);
            return new Message(403, "邮箱已经被注册");
        }

        //判断身份证是否重复
        WorkerExample we3 = new WorkerExample();
        WorkerExample.Criteria wc3 = we3.createCriteria();
        wc3.andIdCardEqualTo(worker.getIdCard());
        List<Worker> workerList3 = workerMapper.selectByExample(we3);
        if (workerList3.size() > 0) {
            response.setStatus(403);
            return new Message(403, "身份证已经被注册");
        }

        //TODO 将密码和md5加密后的密码存入数据库，方便开发时调试
//        Mapping mapping = new Mapping();
//        mapping.setPassword(worker.getWorkerPass());
//        mapping.setEncryption(StringUtils.md5(worker.getWorkerPass()));
//        mappingMapper.insert(mapping);


        //设置创建日期
        worker.setCreateAt(new Date());
        worker.setWorkerPass(StringUtils.md5(worker.getWorkerPass()));

        //添加账号
        workerMapper.insert(worker);

        return new Message(200, worker.getWorkerNo() + "");
    }

    @GetMapping("token")
    public Message getToken(String workerNo, String password, HttpServletResponse response) {
        Worker worker = workerMapper.selectByPrimaryKey(workerNo);
        if (worker == null) {
            response.setStatus(403);
            return new Message(403, "该工号尚未注册");
        }
        if (!worker.getWorkerPass().equals(StringUtils.md5(password))) {
            response.setStatus(403);
            return new Message(403, "密码错误");
        }
        String tokenValue = JwtUtils.createJWT(workerNo, "wgb", "", -1);
        Token token = new Token();
        token.setTokenValue(tokenValue);
        token.setExpiredTime(new Date(System.currentTimeMillis() + TOKEN_TIME_TO_LIVE));
        tokenMapper.insert(token);
        return new Message(200, tokenValue);
    }

    @DeleteMapping("token")
    public Message deleteToken(@RequestHeader("Authorization") String tokenValue, HttpServletResponse response) {
        Claims claims = JwtUtils.parseJWT(tokenValue);
        TokenExample tokenExample = new TokenExample();
        TokenExample.Criteria tc = tokenExample.createCriteria();
        tc.andTokenValueEqualTo(tokenValue);
        List<Token> tokenList = tokenMapper.selectByExample(tokenExample);
        if (tokenList.isEmpty()) {
            response.setStatus(401);
            return new Message(401, "退出登录失败，无效token");
        }

        tokenMapper.deleteByExample(tokenExample);
        return new Message(200, "退出登录成功");
    }


    @GetMapping("{worker_no}")
    public Worker getWorkerInfo(@PathVariable("worker_no") String workerNo, HttpServletResponse response) throws InvalidTokenException, InvalidWorkerNoException {
        Worker w = workerMapper.selectByPrimaryKey(workerNo);
        if (w == null) {
            throw new InvalidWorkerNoException();
        }
        w.setWorkerPass(null);
        return w;

    }

    @PutMapping("{worker_no}")
    public Message modifyWorkerInfo(@RequestHeader("Authorization") String tokenValue, @PathVariable("worker_no") String workerNo, @RequestBody Worker worker, HttpServletResponse response) throws Exception {
        Claims claims = checkToken(tokenValue);
        if (!claims.getId().equals(workerNo) || !workerNo.equals(worker.getWorkerNo())) {
            throw new NoPermissionException();
        }
        if (worker.getWorkerPass() != null && worker.getWorkerPass().length() > 0) {
            worker.setWorkerPass(StringUtils.md5(worker.getWorkerPass()));
        }
        Worker w = workerMapper.selectByPrimaryKey(workerNo);


        if (worker.getPhone() != null && !w.getPhone().equals(worker.getPhone())) {
            //手机号长度和格式判断
            if (worker.getPhone().length() != 11 || !StringUtils.isDigitsOnly(worker.getPhone())) {
                response.setStatus(403);
                return new Message(403, "手机号格式错误");
            } else {
                //判断手机号是否重复
                WorkerExample we1 = new WorkerExample();
                WorkerExample.Criteria wc1 = we1.createCriteria();
                wc1.andPhoneEqualTo(worker.getPhone());
                List<Worker> workerList1 = workerMapper.selectByExample(we1);
                if (workerList1.size() > 0) {
                    response.setStatus(403);
                    return new Message(403, "手机号已经被注册");
                }

            }
        }

        if (worker.getEmail() != null && !w.getEmail().equals(worker.getEmail())) {
            //邮箱格式判断
            if (!StringUtils.isEmailFormat(worker.getEmail())) {
                response.setStatus(403);
                return new Message(403, "邮箱格式错误");
            } else {
                //判断邮箱是否重复
                WorkerExample we2 = new WorkerExample();
                WorkerExample.Criteria wc2 = we2.createCriteria();
                wc2.andEmailEqualTo(worker.getEmail());
                List<Worker> workerList2 = workerMapper.selectByExample(we2);
                if (workerList2.size() > 0) {
                    response.setStatus(403);
                    return new Message(403, "邮箱已经被注册");
                }
            }
        }

        if (worker.getIdCard() != null && !w.getPhone().equals(worker.getPhone())) {
            if (worker.getIdCard().length() != 18 || !StringUtils.isDigitsOnly(worker.getIdCard())) {
                //身份证号长度和格式判断
                response.setStatus(403);
                return new Message(403, "身份证号格式错误");
            } else {
                //判断身份证是否重复
                WorkerExample we3 = new WorkerExample();
                WorkerExample.Criteria wc3 = we3.createCriteria();
                wc3.andIdCardEqualTo(worker.getIdCard());
                List<Worker> workerList3 = workerMapper.selectByExample(we3);
                if (workerList3.size() > 0) {
                    response.setStatus(403);
                    return new Message(403, "身份证已经被注册");
                }
            }
        }

        workerMapper.updateByPrimaryKeySelective(worker);
        return new Message(200, "修改成功");

    }

    private Claims checkToken(String tokenValue) throws InvalidTokenException {
        if (tokenValue == null || tokenValue.length() == 0) {
            throw new InvalidTokenException();
        }
        Claims claims = JwtUtils.parseJWT(tokenValue);
        TokenExample tokenExample = new TokenExample();
        TokenExample.Criteria tc = tokenExample.createCriteria();
        tc.andTokenValueEqualTo(tokenValue);
        List<Token> tokenList = tokenMapper.selectByExample(tokenExample);
        if (tokenList.isEmpty()) {
            throw new InvalidTokenException();
        }
        return claims;
    }

    @ExceptionHandler({UnsupportedJwtException.class, MalformedJwtException.class, InvalidTokenException.class})
    public Message handlerTokenException(HttpServletResponse response) {
        response.setStatus(403);
        return new Message(403, "无效token");
    }

    @ExceptionHandler({InvalidWorkerNoException.class})
    public Message handlerInvalidWorkerNoException(HttpServletResponse response) {
        response.setStatus(403);
        return new Message(403, "工号不存在");
    }

    @ExceptionHandler(NoPermissionException.class)
    public Message handlerNoPermissionException(HttpServletResponse response) {
        response.setStatus(403);
        return new Message(403, "你没有修改该工号的权限");
    }

//    @ExceptionHandler(Exception.class)
//    public Message handlerOtherException(HttpServletResponse response, Exception e) {
//        response.setStatus(500);
//        return new Message(500, "服务器内部错误");
//    }

}
