package com.iteator.collection;
//Collection没有泛型之前智能存储object
//collection常用方法
import java.util.*;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList(); //duotai,接口不能直接new对象
        //常用方法add
        c.add(1200);    //自动装箱
        c.add(3.14);
        c.add(new Object());
        c.add(true);

        System.out.println("集合中的元素个数" + c.size());
        c.clear();
        c.add(1200);    //自动装箱
        c.add(3.14);
        //c里面是否包含某个元素
        System.out.println(c.contains("1200"));
        c.remove(3.14);
        System.out.println(c.isEmpty());
        //转换成数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
        /*
        迭代，在map集合中不能用，只有在Collection集合中才能使用
         */
        c.clear();
        c.add("a");
        c.add("b");
        c.add("c");
        //第一步，获取迭代器
        Iterator it = c.iterator();
        /*
        迭代器方法：
        boolean hasNext() 如果迭代具有更多元素，则返回 true 。
        E next() 返回迭代中的下一个元素。
         */
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
