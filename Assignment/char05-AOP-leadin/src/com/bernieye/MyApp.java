package com.bernieye;

import com.bernieye.handler.MyInvocationHandler;
import com.bernieye.service.SomeService;
import com.bernieye.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
//        SomeService service = new SomeServiceImpl();
//        service.doSome();

        /*使用jdk的Proxy创建代理对象*/
        //创建对象
        SomeService target = new SomeServiceImpl();
        //创建InvocationHandler
        InvocationHandler handler = new MyInvocationHandler(target);
        //Proxy
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);

        //调用invoke
        proxy.doSome();
        //proxy.doOther();
    }
}
