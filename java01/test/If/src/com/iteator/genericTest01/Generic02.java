package com.iteator.genericTest01;

public class Generic02<泛型标识符随便写> {
    public void doSome(int o) {

    }
    public void fun(泛型标识符随便写 p) {
        System.out.println(p);
    }

    public static void main(String[] args) {
        Generic02<String> gt = new Generic02<>();   //不用泛型就是object
        gt.fun("12");
    }
}
