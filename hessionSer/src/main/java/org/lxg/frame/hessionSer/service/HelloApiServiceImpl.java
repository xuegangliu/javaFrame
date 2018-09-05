package org.lxg.frame.hessionSer.service;

import com.caucho.hessian.server.HessianServlet;
import org.lxg.frame.hessionApi.api.HelloApi;
import org.lxg.frame.hessionApi.bean.User;

/**
 * Created by 刘雪岗 on 2017/2/27.
 */
public class HelloApiServiceImpl extends HessianServlet implements HelloApi {

    @Override
    public String sayHello(User user) {
        return "hello:"+user.getUsername();
    }
}