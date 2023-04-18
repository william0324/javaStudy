package com.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //转入1970.1.1 00:00:00 000到现在毫秒数
        Date time = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String sTime = sdf.format(time);
        System.out.println(sTime);
        //获取昨天的此时时间
        Date time2 = new Date(System.currentTimeMillis() - 1000*60*60*24);
        String sTime2 = sdf.format(time2);
        System.out.println(sTime2);
    }
}
