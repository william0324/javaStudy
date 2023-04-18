package com.iteator.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1.List
 */
public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(1,"4654654");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf("d"));
        System.out.println(list.lastIndexOf("c"));
        list.set(2,"22222");
    }
}
