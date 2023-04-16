package com.javase.stringtest;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   //true
        String x = new String("abc");
        String y = new String("abc");
        System.out.println(x == y); //false
        System.out.println(x.equals(y));    //true,String类已经重写了equals类
    }
}
