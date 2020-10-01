package com.bernieye.ba02;

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
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
