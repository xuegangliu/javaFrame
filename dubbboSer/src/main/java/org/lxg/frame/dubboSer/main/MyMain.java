package org.lxg.frame.dubboSer.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘雪岗 on 2017/2/27.
 */
public class MyMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });

        context.start();
        System.out.println("按任意键退出");
        System.in.read();

    }
}