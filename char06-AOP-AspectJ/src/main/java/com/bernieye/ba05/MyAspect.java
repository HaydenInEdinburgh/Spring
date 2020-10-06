package com.bernieye.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    /**
     * @After 最终通知
     *  属性：1、value 切入点表达式
     *
     *  特点：1、总是会执行
     *       2、在目标方法之后执行*/
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter(){
        System.out.println("执行最终通知，总会被执行的代码");
        //通常用来清除资源
    }

}
