package com.javase.arry;
//数组扩容
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dest = new int[20];
        //源数组，源起始位置，目标数组，目标起始位置，长度
        System.arraycopy(src,0,dest,0,5);
    }
}
