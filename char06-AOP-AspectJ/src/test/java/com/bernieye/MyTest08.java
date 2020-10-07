package com.bernieye;

import com.bernieye.ba08.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest08 {
    @Test
    public void test(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");
        proxy.doThird();
        System.out.println(proxy.getClass().getName());
        //目标类没有借口，用的是cglib动态代理
    }
}
