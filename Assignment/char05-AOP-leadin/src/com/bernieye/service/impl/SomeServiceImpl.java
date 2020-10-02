package com.bernieye.service.impl;

import com.bernieye.service.SomeService;
import com.bernieye.util.ServiceTools;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        //ServiceTools.doLog();
        System.out.println("执行业务方法doSome");
        //ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
        //ServiceTools.doLog();
        System.out.println("执行业务方法doOther");
        //ServiceTools.doTrans();
    }
}
