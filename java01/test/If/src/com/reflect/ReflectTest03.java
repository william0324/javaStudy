package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射机制调用一个对象的方法
/*
1.对象
2.方法名
3.实参列表
4.返回值
 */

public class ReflectTest03 {
    public static void main(String[] args) {
        //不使用反射机制
        User user = new User();
        boolean login = user.login("admin","123");
        System.out.println(login?"登陆成功":"登陆失败");
        //通过反射机制
        try {
            Class userClass = Class.forName("com.reflect.User");
            Object obj = userClass.newInstance();
            Method method = userClass.getDeclaredMethod("login",String.class,String.class);
            //最重要
            Object retValue = method.invoke(obj,"admin","123");
            System.out.println(retValue);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
