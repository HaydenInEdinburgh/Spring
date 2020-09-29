package com.pengyiye;

import com.pengyiye.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTests04 {
//    @Test
//    public void test02(){
//        System.out.println("== test02 ==");
//        Student student = new Student();
//        School school = new School();
//        System.out.println(student.toString());
//
//    }

    @Test
    public void test01(){
        System.out.println("== test01 ==");
        String config = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu01 = (Student) ac.getBean("myStudent");
        System.out.println("Student's info: "+ stu01);
    }

}
