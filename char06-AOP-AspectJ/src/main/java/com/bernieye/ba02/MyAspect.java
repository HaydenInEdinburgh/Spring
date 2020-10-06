package com.bernieye.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
   /* @AfterReturning:  后置通知
   * 属性：1.value 切入点表达式
   *      2.returning 自定义的变量，比哦是目标方法的返回值的
   *        自定义变量名必须和通知方法的形参名一样
   * 特点：1、在目标方法之后执行
   *      2、能够获取到目标方法的返回值
   *      3、可以修改返回值
   *
   * 后置通知的执行
   *    Object res = doOther();
   *    myAfterReturning(res);
   *    System.out.println("res" + res)//abcd
   *
   * */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))", returning = "res")
    public void myAfterReturning(Object res){
        System.out.println(" == my AfterReturning == ");
        System.out.println("The returning value --> " + res);

    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))", returning = "res")
    public void myAfterReturning2(Object res){
        System.out.println(" == my AfterReturning2 == ");
        System.out.println("The returning value --> " + res);

    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther3(..))", returning = "res")
    public void myAfterReturning3(Object res){
        //res.setAge(20);
        System.out.println(" == my AfterReturning3 == ");
        System.out.println("The returning value --> " + res);

    }
}
