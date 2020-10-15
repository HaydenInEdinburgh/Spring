package com.bernieye;

import com.bernieye.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //get service from container
        BuyGoodsService service = (BuyGoodsService) ctx.getBean("buyService");

        //invoke the service
        service.buy(1001, 10);
    }
}
