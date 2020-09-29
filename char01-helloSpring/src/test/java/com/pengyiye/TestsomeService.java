package com.pengyiye;
import com.pengyiye.services.impl.someServiceImpl;
import com.pengyiye.services.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestsomeService {

    @Test
    public void test01(){
        someService service = new someServiceImpl();
        service.doSome();

    }

    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        someService ss1 = (someService) ac.getBean("someService01");
        ss1.doSome();
    }

    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println("There are "+ nums+ " beans");
        for(String name: ac.getBeanDefinitionNames()){
            System.out.println(name);
        }

    }

    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date myDate = (Date) ac.getBean("myDate");
        System.out.println("The Date is "+ myDate);
    }

}
