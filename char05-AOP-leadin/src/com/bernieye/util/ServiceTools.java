package com.bernieye.util;

import java.util.Date;

public class ServiceTools {
    public static void doLog(){
        System.out.println("非业务方法 -> log time: "+ new Date());
    }

    public static void doTrans(){
        //when finished
        System.out.println("非业务方法 -> Finished.");
    }
}
