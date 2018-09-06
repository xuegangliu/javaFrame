package org.lxg.frame.api.bean;

import java.io.Serializable;

/**
 * Created by 刘雪岗 on 2017/3/4.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username = "xuegangliu";
    private String password = "123456";

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
