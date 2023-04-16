package com.javase.arry;
import java.util.Arrays;
//二分查找
public class BiSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,8,11,1,2};
        Arrays.sort(arr);
        int index = biSearch(arr,8);
        System.out.println(index);
    }
    public static int biSearch(int []arr,int number) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                end = mid - 1;
            } else if (arr[mid] < number) {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
