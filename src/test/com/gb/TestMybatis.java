package com.gb;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {
    //    private static Logger logger = Logger.getLogger(getClass());
    //	private ApplicationContext ac = null;
    ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1() {
    }

}
