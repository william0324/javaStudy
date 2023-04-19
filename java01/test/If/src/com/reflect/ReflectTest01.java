package com.reflect;

public class ReflectTest01 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.reflect.User");
            Object obj = c.newInstance();   //调用无参数构造方法
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
