package com.entity;

import java.io.Serializable;

/**
 * @program: boot
 * @description:
 * @author: Means
 * @create: 2019-08-29 15:12
 **/
public class UserBean implements Serializable {

    private String user;
    private String pwd;

    public UserBean() {
    }

    public UserBean(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
