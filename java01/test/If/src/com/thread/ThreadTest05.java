package com.thread;

public class ThreadTest05 {
    public static void main(String[] args) {
        Th th = new Th();
        th.setName("后台线程");
        th.setDaemon(true); //设置后台线程
        th.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程进行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Th extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println(currentThread().getName() + "备份");
        }
    }
}