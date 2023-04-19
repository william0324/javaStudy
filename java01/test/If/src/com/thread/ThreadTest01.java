package com.thread;
//实现线程第一种方法
/*
编写一个类，直接继承java.lang.thread，重写run方法
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();   //在jvm开辟一个新的栈空间，代码任务瞬间就结束了。自动调用run方法
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}
