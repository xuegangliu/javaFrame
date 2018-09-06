package org.lxg.frame.dubboSer.service.impl;

import org.lxg.frame.api.dubboApi.SayHelloToClient;

/**
 * Created by 刘雪岗 on 2017/2/27.
 */
public class SayHelloToClientImpl implements SayHelloToClient {

    public String sayHello(String hello){
        System.out.println("我接收到了：" + hello);
        return hello + "你也好啊！！！" ;
    }

}

