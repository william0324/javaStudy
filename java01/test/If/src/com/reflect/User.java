package com.reflect;

public class User {
    public User() {
    }
    private String name;
    private String password;
    private int id;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public boolean login(String name,String password) {
        if("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }
    public void logout () {
        System.out.println("系统已经安全退出!!");
    }
}
