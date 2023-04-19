package com.reflect;

public class ArgTest {
    public static void main(String[] args) {
    //参数个数为0·n个，只能在参数列表最后出现，并且只能有一个
        m();
        m(1,2,3);
        m(1);
        s(new String[] {"1","2"});
        s("1","2");
    }
    public static void m(int... a) {

    }
    public static void s(String... s) {

    }
}
