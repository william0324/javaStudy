package com.iteator.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            //c.remove(it.next()); 错误，集合结构改变迭代器必须更新

            System.out.println(it.next());
            it.remove();    //通过迭代器删除可以
        }
        System.out.println(c.size());   //0
    }
}
