package com.javase.stringtest;

public class StringTest03 {
    public static void main(String[] args) {
        //charAt
        char c = "中国人".charAt(1);
        System.out.println(c);
        //compareTo,前小后大-1，前大后小1，相等0
        int result = "abc".compareTo("abc");
        System.out.println(result);
        //contains判断前面字符串是否包含后面的字符串
        System.out.println("123".contains("12"));
        //split 拆分字符串
        String[] ymd = "1980-10-11".split("-");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }
        //sunString截取字符串
        //toCharArray将字符串转换成char数组
        char[] cha = "我是中国人".toCharArray();
        for (int i = 0; i < cha.length; i++) {
            System.out.println(cha[i]);
        }
    }
}
