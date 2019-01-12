package org.lxg.frame.doorls.bean;

import java.util.Date;

/**
 * @author: xuegangliu
 * @date: 5/29/2018 6:03 PM
 * @DES:
 * @version: v1.0
 */
public class User {
    private int id;
    private int status;
    private String name;
    private Date birthday;
    private int age;
    private int sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "status=" + status +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public User(int id, int status, String name, Date birthday, int age, int sex) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
    }
}
