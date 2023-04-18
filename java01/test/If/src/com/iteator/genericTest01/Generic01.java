package com.iteator.genericTest01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic01 {
    public static void main(String[] args) {
        List list =new ArrayList();
        Cat c = new Cat();
        Bird bird = new Bird();
        list.add(c);
        list.add(bird);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            //没有泛型需要向下转型，通过迭代器取出的是object
            Object obj = it.next();
            if(obj instanceof Animal) {
                Animal a = (Animal)obj;
                a.move();
            }
        }
        //使用泛型之后集合中的存储类型统一，只能存储Animal类型
        List<Animal> list1 = new ArrayList<>();
        list1.add(c);;
        list1.add(bird);
        Iterator<Animal> it1 = list1.listIterator();
        while(it1.hasNext()) {
            //不需要强制类型转换，it是animal类型
            it1.next().move();
        }
    }
}
class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}
class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在移动");
    }
}
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("鸟在移动");
    }
    public void birdFun() {
        System.out.println("鸟吃重紫");
    }
}