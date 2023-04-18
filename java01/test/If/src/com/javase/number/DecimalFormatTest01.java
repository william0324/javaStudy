package com.javase.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.00"); //保留两个小数位
        String s = df.format(123456.1);
        System.out.println(s);
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        String s1 = df.format(123456.1);
        System.out.println(s1);
        /*
        BigDecimal处理大数据，财务用的
         */
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

    }
}
