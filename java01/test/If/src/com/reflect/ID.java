package com.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解只能出现在勒类上面
@Target(ElementType.TYPE)
//注解可以被反射机制读取
@Retention(RetentionPolicy.RUNTIME)
public @interface ID {

}
//标注类，类中必须有一个int id属性