package com.iteator.map;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Vip> treeSet = new TreeSet<>();
        treeSet.add(new Vip("123",20));
        treeSet.add(new Vip("555",21));
        treeSet.add(new Vip("666",22));
        treeSet.add(new Vip("1111",22));
        treeSet.add(new Vip("11",19));
        for (Vip o : treeSet) {
            System.out.println(o);
        }
    }

}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    //排序规则
    public int compareTo(Vip o) {
        //年龄相等按名字排序
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        } else {
            //不一样按照年龄排
            return this.age - o.age;
        }
    }
}
