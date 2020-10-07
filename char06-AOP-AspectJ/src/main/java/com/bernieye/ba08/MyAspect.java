package com.bernieye.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    /**
     * @PointCut 定义和管理重复切入点
     *  属性：1、value 切入点表达式
     *  特点：当使用PointCut定义在一个方法上面，这个方法的名称就是切入点的别名*/
    @After(value = "mypt()")
    public void myAfter(){
        System.out.println("执行最终通知，总会被执行的代码");
        //通常用来清除资源
    }

    @Before(value = "mypt()")
    public void myBefore(){
        System.out.println("执行前置通知");
    }

    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void mypt(){

    }
}
