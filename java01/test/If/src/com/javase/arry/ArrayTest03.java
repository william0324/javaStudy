package com.javase.arry;

public class ArrayTest03 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] an = {a1,a2};
        for (int i = 0; i < 2; i++) {
            an[i].move();
        }
    }
}
class Animal{
    public void move() {
        System.out.println("Animal move");
    }
}