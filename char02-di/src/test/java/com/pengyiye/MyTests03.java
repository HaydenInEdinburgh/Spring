package com.pengyiye;

import com.pengyiye.ba03.School;
import com.pengyiye.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTests03 {
//    @Test
//    public void test02(){
//        System.out.println("== test02 ==");
//        Student student = new Student();
//        School school = new School();
//        System.out.println(student.toString());
//
//    }

    @Test
    public void test03(){
        System.out.println("== test03 ==");
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu01 = (Student) ac.getBean("myStudent");
        System.out.println("Student's info: "+ stu01);

        File readme = (File) ac.getBean("myFile");
        System.out.println("my File is "+ readme.getName());
    }

}
