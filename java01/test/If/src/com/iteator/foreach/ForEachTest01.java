package com.iteator.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //putong遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        //增强foreach，data是数组中的元素
        for (int data : arr) {
            System.out.print(data);
        }
        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> it = list.iterator();
        for (Integer i: list) {
            System.out.print(i);
        }
    }
}
