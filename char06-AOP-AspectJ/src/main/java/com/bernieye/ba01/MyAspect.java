package com.bernieye.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/*
* @AspectJ:是aspectJ框架的注解
* 作用：表示当前类是切面类
* 切面类：是用来给业务方法增加功能的类
* 位置：类的定义上面
*/
@Aspect
public class MyAspect {
    /*
    * Define Method
    * Requirements: 1.public method
    *               2.no return value
    *               3.customized name
    *               4.can be with or without parametersß
    */

    /*@Before: 前置通知
    *   属性：value，是切入点表达式
    *   位置：在方法上面
    * 特点：
    *   1.  在目标之前执行
    *   2.  不会改变目标方法的执行结果
    *   3.  不会影响目标方法的执行
    * */
//    @Before(value = "execution(public void com.bernieye.ba01.SomeServiceImpl.doSome(String, Integer))")
//    public void doBefore(){
//        //What aspect is gonna do
//        System.out.println("前置通知 --> 执行时间：" + new Date());
//    }

    @Before(value = "execution(public void *..SomeServiceImpl.doSome(..))")
    public void doBefore(){
        //What aspect is gonna do
        System.out.println("前置通知 --> 执行时间：" + new Date());
    }
}
