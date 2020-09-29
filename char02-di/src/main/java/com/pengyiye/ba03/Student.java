package com.pengyiye.ba03;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student(){
        System.out.println("无参构造");
    }

    public Student(String myname, int myage, School myschool){
        System.out.println("有参数构造");
        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("set school "+school);
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
