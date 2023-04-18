package com.iteator.map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("r");
        treeSet.add("d");
        for (String s : treeSet) {
            System.out.println(s);  //字符串排序

        }
        treeSet.clear();
        //不可以对自定义类型进行排序,没有实现comparable接口
        People people = new People(23);
        People people1 = new People(26);
        People people2 = new People(22);
        //TreeSet<People> treeSet1 = new TreeSet<>(new PeopleComparable());
        //匿名内部类
        TreeSet<People> treeSet1 = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.age - o2.age;
            }
        });
        treeSet1.add(people);
        treeSet1.add(people1);
        treeSet1.add(people2);
        for (People s : treeSet1) {
            System.out.println(s);

        }
    }
}
class People {
    int age;

    public People() {
    }

    public People(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                '}';
    }
}
//单独编写一个比较器
//comparable是java.util.lang下的，comparator是java.util包下的
/*class PeopleComparable implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.age - o2.age;
    }
}*/