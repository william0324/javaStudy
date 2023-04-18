package com.javase.date;

public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis =  System.currentTimeMillis();   //获取1970.1.1 00:00:00 000到当前系统时间的总毫秒数
        System.out.println(nowTimeMillis);
        //统计一个方法执行所耗费的时长
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end - begin)+"毫秒");
    }
    public static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
}
