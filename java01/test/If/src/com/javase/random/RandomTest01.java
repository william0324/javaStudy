package com.javase.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        //产生一个int型类型范围内的随机数
        Random random = new Random();
        int a = random.nextInt();
        System.out.println(a);

        //[0~100]随机数
        int b = random.nextInt(101);
        System.out.println(b);

    }
}
