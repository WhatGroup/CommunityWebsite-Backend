package com.gb.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        DateFormat format = null;
        if (source == null || source.length() == 0) {
            throw new NullPointerException("请传入正确数据");
        }
        try {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("请输入正确的日期格式,正确的日期格式为：yyyy-MM-dd HH:mm:ss");
        }
    }
}
