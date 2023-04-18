package com.javase.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //获取系统当前时间
        Date nowTime = new Date();
        System.out.println(nowTime);    //重写了toString方法
        //日期格式化
        /*
            yyyy 年
            MM月
            dd日
            HH时
            mm分
            ss 秒
            SSS毫秒
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowT = sdf.format(nowTime);
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss SSS");
        String nowT2 = sdf2.format(nowTime);
        System.out.println(nowT);
        System.out.println(nowT2);
        //现在有一个日期字符串string，转换成date类型
        String time = "2023-04-16 10:47:39 346";
        //格式要与字符串一样
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf3.parse(time);   //注意抛出异常
        System.out.println(dateTime);
    }
}
