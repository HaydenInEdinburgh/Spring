package com.bernieye.ba01;
//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //在执行前，输出执行时间
        System.out.println("====== Object Method =====");
    }
}
