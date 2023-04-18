package com.javase.enumTest;
//枚举编译之后也是生成class
/*
结果只有两种，使用bool
结果有多种，可以一枚一枚列举出来，建议使用枚举
 */
public class EnumTest {
    public static void main(String[] args) {
        Result r = divide(10,0);
        System.out.println(r == Result.SUSSES? "计算成功" : "计算失败");
    }
    public static Result divide(int a,int b) {
        try {
            int c = a / b;
            return Result.SUSSES;
        } catch(Exception e) {
            return Result.FAIL;
        }
    }
}
enum Result {
    SUSSES,FAIL
}