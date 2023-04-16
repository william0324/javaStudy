package com.javase.stringbuffer;

public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer(); //初始化容量16，优化初始化尽量给一个大的容量
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append(12);
        stringBuffer.append(true);
        System.out.println(stringBuffer);
        StringBuffer stringBuffer1 = new StringBuffer(100);
    }


}
