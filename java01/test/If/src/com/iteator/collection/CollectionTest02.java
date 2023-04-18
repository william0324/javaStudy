package com.iteator.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        String s1 = new String("abd");
        String s2 = new String("def");
        c.add(s1);
        c.add(s2);
        String x = new String("abd");
        System.out.println(c.contains(x));  //true
        c.remove(x);
        System.out.println(c.size());   //1,删掉了s1
    }
}
