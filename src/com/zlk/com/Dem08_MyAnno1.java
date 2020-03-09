package com.zlk.com;

/**
 * @description: 自定义注解
 * * 1:格式：
 * *    元注解
 * *    public @interface 注解名称{}
 * *
 * 2、本质：就是一个继承了Annotation接口的接口。
 * *    public interface MyAnnotation extends java.lang.Annotation{}
 * <p>
 * 3、属性：接口中的抽象方法
 * 要求：
 * 1）属性的返回值类型；（void不允许）
 * 基本数据类型；
 * String
 * 枚举
 * 注解
 * 以上类型的数组。
 * 2)定义了属性，在使用时需要给属性赋值。
 * 如果定义属性是，使用default关键字给属性默认初始化值，可不用赋值。
 * 如果只有一个属性需要赋值，并且属性的名称是value，则value直接定义值即可。
 * 如果使用数组，赋值
 *
 *
 * @author: Zlk
 * @date: 2020/3/913:57
 */
public @interface Dem08_MyAnno1 {
    //public abstract String name();
    String value();

    int a() default 3;  //默认初始化值，省略public abstract
/*
    String down();
    int add();*/
    String[] strArrays();


}
