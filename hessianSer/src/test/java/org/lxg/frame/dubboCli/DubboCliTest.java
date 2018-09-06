package org.lxg.frame.dubboCli;

import org.junit.Test;
import org.lxg.frame.api.dubboApi.SayHelloToClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xuegangliu
 * @date: 9/6/2018 12:50 PM
 * @DES:
 * @version: v1.0
 */
public class DubboCliTest {

    @Test
    public void dubboClientTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });

        context.start();

        //获取服务器那边的bean
        SayHelloToClient demoService = (SayHelloToClient) context.getBean("demoService");

        System.out.println(demoService.sayHello("xxxx"));
    }
}
