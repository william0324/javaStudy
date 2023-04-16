package com.javase.integer;

public class IntegerTest01 {
    public static void main(String[] args) {
        //基本数据类型 -(转换为)-》引用数据类型（装箱）
        Integer i = new Integer(123);
        //引用类型->基本数据类型（拆箱）
        int r = i.intValue();
        System.out.println(r);
        Integer x = 100;//自动装箱
        int y = x;//自动拆箱
    }
}
