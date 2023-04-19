package com.reflect;


import java.lang.reflect.Field;

public class Test01 {
    public static void main(String[] args) {
        try {
            Class use1 = Class.forName("com.reflect.User");
            //判断类上面是否有类注解
            /*
            当一个类上面有@Id注解的时候，要求类中必须存在int类型的id属性,如果没有int类型的id属性则报异常。
            获取类的属性
             */
            if (use1.isAnnotationPresent(ID.class)) {
                Field[] fields = use1.getDeclaredFields();
                boolean isOk = false;
                for (Field field : fields) {
                    if("id".equals(field.getName()) && "int".equals((field.getType().getSimpleName()))) {
                        isOk = true;
                        break;
                    }
                }
                if (!isOk) {
                    throw new ThreadId("没有id呦！！");
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
