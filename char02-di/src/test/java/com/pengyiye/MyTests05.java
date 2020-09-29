package com.pengyiye;

import com.pengyiye.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTests05 {

    @Test
    public void test01(){
        System.out.println("== test01 ==");
        String config = "ba05/springTotal.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    }
}
