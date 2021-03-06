package com.bernieye;

import com.bernieye.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {

    @Test
    public void test(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        //proxy --> JDK动态代理
        SomeService proxy = (SomeService) ac.getBean("someService");
        String str = proxy.doFirst("Amy", 30);//myAround
        System.out.println(str);
    }
}
