package org.lxg.frame.dooorls;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.lxg.frame.doorls.bean.User;

import java.util.Date;

/**
 * @author: xuegangliu
 * @date: 5/29/2018 5:31 PM
 * @DES:
 * @version: v1.0
 */
public class HelloWorldTest {

    @Test
    public void ttTest(){
        User user = new User();
        user.setAge(18);
        user.setId(5);
        user.setBirthday(new Date());
        user.setName("小宝");
        user.setSex(1);
        user.setStatus(1);

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("TestRule1");
        kieSession.insert(user);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    @Test
    public void testHelloWorld() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("helloWorldSession");
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    @Test
    public void testRule(){
        User user = new User();
        user.setAge(18);
        user.setId(5);
        user.setBirthday(new Date());
        user.setName("Xiao Bao");
        user.setSex(1);
        user.setStatus(1);

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("TestRule1");
        kieSession.insert(user);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
