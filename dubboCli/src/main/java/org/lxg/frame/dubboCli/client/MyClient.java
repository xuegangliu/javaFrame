package org.lxg.frame.dubboCli.client;

import com.lxg.service.SayHelloToClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘雪岗 on 2017/2/27.
 */
public class MyClient {
    public void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });

        context.start();

        //获取服务器那边的bean
        SayHelloToClient demoService = (SayHelloToClient) context.getBean("demoService");

        System.out.println(demoService.sayHello("xxxx"));
    }
}

