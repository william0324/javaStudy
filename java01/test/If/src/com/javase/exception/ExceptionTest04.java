package com.javase.exception;

public class ExceptionTest04 {
    public static void main(String[] args) {
        MyException e = new MyException("hhh");
        e.printStackTrace();
        String me = e.getMessage();
        System.out.println(me);
    }
}
/*
    自定义异常类：
    第一步：编写一个类继承Exception或者RuntimeException
    第二步：提供两个构造方法，一个无参的，一个带有String参数的
 */
class MyException extends Exception{
    public MyException() {

    }
    public MyException(String s) {
        super(s);
    }
}