package com.bernieye;

import com.bernieye.ba02.SomeService;
import com.bernieye.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //get object
        SomeService proxy = (SomeService) ac.getBean("someService");

        Student stA = new Student();
        stA.setName("bernie");
        stA.setAge(20);

        String res = proxy.doOther2(stA);

        //System.out.println(res);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //get object
        SomeService proxy = (SomeService) ac.getBean("someService");
        proxy.doOther3("bernie", 20);
    }
}
