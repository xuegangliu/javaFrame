package org.lxg.frame.dubboCli;

import com.caucho.hessian.client.HessianProxyFactory;
import org.junit.Test;
import org.lxg.frame.api.bean.User;
import org.lxg.frame.api.hessionApi.HelloApi;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: xuegangliu
 * @date: 9/6/2018 1:55 PM
 * @DES:
 * @version: v1.0
 */
public class HessianTest {
    static ExecutorService es =  Executors.newFixedThreadPool(10);
    /**
     * 测试hessian服务是否可用，并要求在2秒内获得响应
     * @throws MalformedURLException
     */
    @Test//(timeout = 2000)
    public void testService4Success() throws MalformedURLException {

        String url = "http://localhost:8888/hessian";
        System.out.println("请求的服务端地址：" + url);

        HessianProxyFactory factory = new HessianProxyFactory();
        HelloApi helloApi = (HelloApi) factory.create(HelloApi.class, url);
        User user = new User();
        System.out.println("服务端返回结果为：" + helloApi.sayHello(user));


        HashMap<String, Object> detailData = new HashMap<String, Object>();
        detailData.put("isMarried", "N");
        detailData.put("gender", "F");

        User userTemp = new User();
        userTemp.setUsername( "aaa" );
        userTemp.setPassword( "1234" );

        int time = 100000;
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< time; i++){
            es.execute(new Runnable() {

                @Override
                public void run() {
//                    helloApi.sayHello(user);
                }
            });

        }

        System.out.println(time + "次调用耗时:" + (System.currentTimeMillis() - startTime));

    }
}
