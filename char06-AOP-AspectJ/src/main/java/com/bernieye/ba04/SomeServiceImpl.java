package com.bernieye.ba04;

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

    @Override
    public void doSecond() {
        System.out.println("===== do Second ======"+10/0);
    }
}
