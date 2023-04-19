package com.thread;

public class ThreadTest02 {
    //第二种方式，编写一个类，实现java.lang.Runnable，实现run方法
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("专线线程--->"+i);
        }
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}