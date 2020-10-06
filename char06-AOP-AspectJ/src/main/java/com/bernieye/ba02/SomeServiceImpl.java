package com.bernieye.ba02;

//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("====== do Some =====");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("====== do Other ======");
        return "abcd";
    }

    @Override
    public String doOther2(Student student) {
        System.out.println(student.toString());

        student.setAge(20);
        student.setName("Amy");
        //System.out.println(student.toString());

        return student.toString();
    }

    @Override
    public Student doOther3(String name, Integer age) {
        Student student = new Student();
        student.setName("lisi");
        student.setAge(30);
        return student;
    }
}
