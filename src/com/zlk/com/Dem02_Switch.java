package com.zlk.com;


/**
 * @description: switch
 * 注意：1：多个switch后面的值不能重复。
 *  2：switch只支持：byte/short/char/int四种基本数据类型。以及，引用数据类型：String字符串、enum枚举。
 *  3:匹配那个case就从哪一个位置往下执行，知道遇到break或者整体结束为止。
 * @author: Zlk
 * @date: 2020/3/316:55
 */
public class Dem02_Switch {
    public static void main(String[] args) {
        int num = 5;
        switch (num){
            case 2:
                System.out.println("AAAA");
                break;
            case 5:
                System.out.println("BBBBB");
                break;
            default:
                System.out.println("大家好，我是渣渣辉！");
                break;
        }
    }
}
