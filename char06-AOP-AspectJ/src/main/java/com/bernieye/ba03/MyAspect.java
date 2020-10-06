package com.bernieye.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    /**
    *环绕通知方法的定义格式
     * 1、public
     * 2、必须有一个返回值，推荐使用Object
     * 3、方法名称自定义
     * 4、方法有参数，固定的参数 proceeding JoinPoint
     **/

    /**
     * @Around：环绕通知
     *  Parameter：Value
     *  position：方法定义的上面
     *  特点：
     *      1、Strongest
     *      2、可以在目标方法前和后增强功能
     *      3、控制目标方法是否被调用执行
     *      4、修改原来的目标方法的执行结果。影响最后的调用结果
     *
     * 环绕通知等同于 JDK动态代理InvocationHandler接口
     * 参数：ProcessdingJoinPoint 就等同于Method
     * 作用：执行目标方法的返回值，就是目标方法的执行结果，可以被修改
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //get first para
        Object args[] = pjp.getArgs();
        String name = null;
        if(args != null && args.length >1){
            Object arg = args[0];
            name = (String)arg;
        }

        Object res = null;
        System.out.println("在目标方法之前，输出时间： "+new Date());
        //1.目标方法调用
        if(name.equals("Amy")){
            res = pjp.proceed();//method.invoke(); Object res = doFirst()
        }

        System.out.println("环绕通知");
        //2.在目标方法之后的前或后加入功能

        //修改目标方法的输出结果
        if( res != null){
            res = "Hello Change";
        }
        return res;
    }

}
