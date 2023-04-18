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
        //java将-128~127之间包装对象放到整数型常量池了
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); //false
        Integer aa = 127;
        Integer bb = 127;
        System.out.println(aa == bb);   //true
        int ret = Integer.parseInt("123");
        double ret2 = Double.parseDouble("3.14");
        String bin = Integer.toBinaryString(3);
        String hex = Integer.toHexString(19);

    }
}
