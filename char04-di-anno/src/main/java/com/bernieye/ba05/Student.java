package com.bernieye.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")//value --> unique value
public class Student {

    @Value("Bernie")
    private String name;
    @Value("20")
    private int age;
    /*ba05 主要为了测试required属性的使用方式。*/
    @Autowired(required = false)
    @Qualifier("mySchoolABC")
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
