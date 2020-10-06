package com.bernieye;

import com.bernieye.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        //proxy --> JDK动态代理
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doSome("bernie",20);
    }
}
