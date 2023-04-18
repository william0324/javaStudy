package com.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
            fileInputStream.read();
        } catch (FileNotFoundException e) { //多个catch从上到下，从小到大
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
