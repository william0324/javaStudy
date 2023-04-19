package com.thread;

public class ThreadTest04 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        MyThread1 myThread1 = new MyThread1(o1,o2);
        MyThread1 myThread2 = new MyThread1(o1,o2);
    }
}
class MyThread1 extends Thread {
    Object object1;
    Object object2;

    public MyThread1(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        //sisuo
        synchronized (object1) {
            synchronized (object2) {

            }
        }
    }
}
class MyThread2 extends Thread {
    Object object1;
    Object object2;

    public MyThread2(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object2) {
            synchronized (object1) {

            }
        }
    }
}