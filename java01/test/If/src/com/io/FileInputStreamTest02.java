package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //工程project的根为idea默认文件
            fileInputStream = new FileInputStream("src//com//io//111.txt");
            byte b[] = new byte[4]; //一次读取四个字节
            /*int readCount = fileInputStream.read(b);    //返回四,再调方法时4个数组满了，重新来覆盖
            System.out.println(new String(b,0,readCount));  //读到多少就打印多少
            readCount = fileInputStream.read(b);
            System.out.println(new String(b,0,readCount));
            readCount = fileInputStream.read(b);
            System.out.println(new String(b,0,readCount));*/
            /*while(true) {
                int readCount = fileInputStream.read(b);
                if (readCount == -1) {
                    break;
                }
                System.out.println(new String(b,0,readCount));
            }*/
            int readCount = 0;
            while ((readCount = fileInputStream.read(b)) != -1) {
                System.out.println(new String(b,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
