package com.bernieye;

import com.bernieye.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTests03 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //get the objects
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student = "+ student);
    }
}
