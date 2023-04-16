package com.javase.stringtest;

public class StringTest02 {
    public static void main(String[] args) {
        byte[] b = {97,98,99};
        String s = new String(b);
        System.out.println(s);
        //将数组中一部分转换成字符串,起始位置，长度
        String s3 = new String(b,1,2);
        System.out.println(s3);
    }
}
