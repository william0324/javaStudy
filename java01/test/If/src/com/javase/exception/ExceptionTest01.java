package com.javase.exception;
//异常在java中以类存在

public class ExceptionTest01 {
    public static void main(String[] args) {
        //因为 doSome 有throws ClassNotFoundException,调用时必须预先处理这个异常,否则不能调用
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    doSome表示方法在执行过程中，有可能会出现ClassNotFoundException异常
     */
    public static void doSome() throws ClassNotFoundException{

    }

}
