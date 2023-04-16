package com.javase.arry;
/*
*   数组是一种引用数据类型,存储在堆中
*   实际上是一种容器
*   数组长度不可变，所有数组对象都有length属性，java自带，只能存储一种数据类型
* 数组在内存中存储时，内存地址是连续的
*
*/
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
