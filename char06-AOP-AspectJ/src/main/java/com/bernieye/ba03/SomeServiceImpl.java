package com.bernieye.ba03;

import com.bernieye.ba02.Student;

//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("====== do Some =====");
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("===== do First =====");
        return "doFirst";
    }
}
