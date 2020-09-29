package com.pengyiye;

import com.pengyiye.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTests {
    @Test
    public void test01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //get object from container
        Student stu1 = (Student) ac.getBean("myStudent");
        System.out.println(stu1.toString());
    }
}
