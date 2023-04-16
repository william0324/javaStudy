package com.javase.arry;
//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,4,8,11,1,2};
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int flag = i;
            for (int j = i+1; j < arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    flag = j;
                }
            }
            if(flag != i) {
                int temp = arr[i];
                arr[i] = arr[flag];
                arr[flag] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
