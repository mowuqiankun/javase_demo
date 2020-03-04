package com.zlk.com;


/**
 * @description:
 * 一：switch循环
 * 注意：1：多个switch后面的值不能重复。
 * 2：switch只支持：byte/short/char/int四种基本数据类型。以及，引用数据类型：String字符串、enum枚举。
 * 3:匹配那个case就从哪一个位置往下执行，知道遇到break或者整体结束为止。
 * 二：for循环
 * 三：do while 循环，至少循环一次。
 * 四：while循环
 *
 * 注意：
 * 1、如果次数确定，多用for循环，否则多用while循环。
 * 2、break跳出循环体; continue跳出当前循环，进入下一次循环;
 * @author: Zlk
 * @date: 2020/3/316:55
 */
public class Dem02_Switch {
    public static void main(String[] args) {
        int num = 5;
        switch (num) {
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

//        String[] arrStr = new String[4];
        String[] arrStr2 = new String[]{"1", "2", "3"};
        System.out.println(arrStr2.length);
        for (String s : arrStr2) {
            System.out.println(s);
        }
        /*for (int i = 0; i < arrStr2.length; i++) {
            String s = arrStr2[i];
            System.out.println(s);
        }*/


    }
}

        /*do {
                System.out.println("无条件执行一次");
                循环体
                }
                while (布尔表达式)

                无条件执行一次，判断while为true，继续执行判断。
         */