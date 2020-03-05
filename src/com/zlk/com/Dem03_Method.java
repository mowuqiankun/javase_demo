package com.zlk.com;

/**
 * @description: 方法、类等复习
 * 一：方法
 *  修饰符 返回值类型 方法名称（参数类型 参数名称，。。。）{
 *     方法体
 *     return 返回值；停止方法，返回值给调用处。
 * }
 *
 * 修饰符
 * 返回值类型：方法最终产生的数据类型
 * 方法名称：小驼峰写法。
 * 参数：进入方法的数据。
 * 返回值：从方法中出来的数据。
 *
 * 方法三种调用方式：
 * 1、单独调用。
 * 2、打印调用:输出语句。
 * 3、赋值调用。
 *
 * 二、方法重载（overload）,多个方法名称相同，参数列表不一样;
 * 1、参数个数不同。
 * 2、参数类型不同
 * 3、参数的多类型顺序不同。
 *
 * 注意： 方法重载与方法的返回值类型无关，与参数的名称无关。
 * println 就是利用了重载
 *
 * @author: Zlk
 * @date: 2020/3/416:48
 */
public class Dem03_Method {
    public static void main(String[] args) {
        int c =sum(1,3);
        System.out.println(c);
    }

    public static int sum(int a,int b){
        System.out.println("方法重载2个参数");
        return a+b;
    }

    public static int sum(double a,double b){
        System.out.println("方法重载2个参数");
        return (int)(a+b);
    }

    public static int sum(double a,int b){
        System.out.println("方法重载2个参数");
        return (int)a+b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("方法重载3个参数");
        return a+b+c;
    }
}
