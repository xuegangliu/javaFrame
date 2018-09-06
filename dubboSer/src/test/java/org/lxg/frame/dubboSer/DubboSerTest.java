package org.lxg.frame.dubboSer;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: xuegangliu
 * @date: 9/6/2018 12:41 PM
 * @DES:
 * @version: v1.0
 */
public class DubboSerTest {

    @Test
    public void dubboServer() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });
        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }
}
