package com.bernieye.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
* @Component(value = "myStudent")
*  == <bean id="myStudent" class="com.bernieye.ba01.Student"/>
* 1.    use VALUE 指定对象名称
* 2.    省略value（最常用）
* 3.    由spring指定默认名称（类名全小写）
* */
@Component("myStudent")//value --> unique value
public class Student {
    /*
    * @Value:   set value for primary types
    * Attributes: value<String>
    * Position:   1. before the definition of the attributes.
    *             2. before the setter
    * */
    @Value("Bernie")
    private String name;
    @Value("20")
    private int age;
    @Autowired
    @Qualifier("mySchool")
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
