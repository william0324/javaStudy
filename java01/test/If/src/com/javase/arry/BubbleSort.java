package com.javase.arry;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,8,11,1,2};
        for (int i = arr.length; i > 0 ; i--) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
