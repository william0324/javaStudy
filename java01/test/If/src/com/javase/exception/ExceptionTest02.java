package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        System.out.println("m1 begin");
        try {
            m2();
            System.out.println("执行不了");
        } catch (IOException e) {   //e是new出来的异常对象提供的方法
            e.printStackTrace();
            System.out.println("文件不存在了哦！！！");
        }
        System.out.println("m1 end");   //继续执行
    }
    public static void m2() throws IOException {        //抛FileNotFoundException父类IOException 或Exception都可以
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 end");   //不执行
    }
    public static void m3() throws FileNotFoundException {
        System.out.println("m3 begin");
        new FileInputStream("C:\\Users\\William\\Desktop\\kkk\\git\\REAE.md");    //构造方法有抛出异常
        System.out.println("m3 end");   //不执行
    }
}
