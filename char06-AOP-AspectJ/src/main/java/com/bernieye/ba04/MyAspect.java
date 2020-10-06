package com.bernieye.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    /**
     * @AfterThrowing 异常通知
     *  属性：1、value 切入点表达式
     *       2、throwing
     *  特点：1、在目标方法跑出异常时执行
     *       2、可以做异常的监控程序*/
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))", throwing = "ex")
    public void myAfterThrowing(Exception ex){
        System.out.println("方法发生异常时执行" + ex.getMessage());
        //send email or message to developers
    }

}
