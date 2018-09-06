package org.lxg.frame.hessianSer;

import com.caucho.hessian.server.HessianServlet;
import org.lxg.frame.api.bean.User;
import org.lxg.frame.api.hessionApi.HelloApi;

/**
 * Created by 刘雪岗 on 2017/2/27.
 */
public class HelloApiServiceImpl extends HessianServlet implements HelloApi {

    @Override
    public String sayHello(User user) {
        return "hello:"+user.getUsername();
    }
}