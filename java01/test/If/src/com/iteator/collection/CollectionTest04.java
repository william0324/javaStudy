package com.iteator.collection;

import java.util.*;

public class CollectionTest04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //ArrayList线程不安全
        //变成线程安全的
        Collections.synchronizedList(list);
        //排序,自定义类要实现comparable
        list.add("b");
        list.add("c");
        list.add("a");
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
        // 对set集合排序，将set转换成list
        Set<String> set = new HashSet<>();
        List<String> myList = new ArrayList<>(set);

    }
}
