package com.thread;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date firstTime = simpleDateFormat.parse("2022-03-14 09:30:33");
            timer.schedule(new LogTimeTask(),firstTime,1000*10);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
//定时任务类
class LogTimeTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = simpleDateFormat.format(new Date());
        System.out.println(strTime + "成功完成了一次数据备份");

    }
}
