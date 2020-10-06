package com.bernieye.handler;

import com.bernieye.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("当前执行 Invoke");
        //通过代理对象执行方法时，会执行invoke()
        Object res = null;
        ServiceTools.doLog();
        //执行目标类的方法
        res = method.invoke(target, args);//SomeService.doSome() doOther()
        ServiceTools.doTrans();
        return res;
    }
}
