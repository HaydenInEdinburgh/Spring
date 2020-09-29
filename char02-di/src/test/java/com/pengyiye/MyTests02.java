package com.pengyiye;

import com.pengyiye.ba02.School;
import com.pengyiye.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTests02 {
    @Test
    public void test02(){
        System.out.println("== test02 ==");
        Student student = new Student();
        School school = new School();
        System.out.println(student.toString());

    }

    @Test
    public void test03(){
        System.out.println("== test03 ==");
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu01 = (Student) ac.getBean("myStudent");
        System.out.println("Student's info: "+ stu01);
    }
}
