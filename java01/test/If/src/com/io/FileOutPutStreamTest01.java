package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutPutStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            //源文件清空重新写入/新建
            //fileOutputStream = new FileOutputStream("111.txt");
            //追加
            fileOutputStream = new FileOutputStream("src//com//io//111.txt",true);
            byte[] bytes = {97,98,99,100};
            fileOutputStream.write(bytes);
            fileOutputStream.write(bytes,0,4);
            String s = "活塞环股份尼斯不和你";
            byte[] bytes1 = s.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes1);
            fileOutputStream.flush();   //写完一定要刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
