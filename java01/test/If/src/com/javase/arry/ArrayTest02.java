package com.javase.arry;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        printArray(a);
        int[] b = new int[5];
        printArray(b);
        printArray(new int[]{2,6,4});
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
