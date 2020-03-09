package zlk.com;

import java.util.Random;
import java.util.Scanner;

/**
 * @description: java常用JDK
 * 一：Scanner类的功能，可以实现键盘输入。
 * 二：Random类，用来随机。
 *
 *
 *
 * @author: Zlk
 * @date: 2020/3/515:58
 */
public class Dem06_Java_Jdk {
    public static void main(String[] args) {
        //--------------代表从键盘输入Scanner-------------------
        Scanner scanner = new Scanner(System.in);
        //代表输入的数字
        int num = scanner.nextInt();
        System.out.println("输入的数字是"+num);

        //输入的字符串
        String st=scanner.next();
        System.out.println("输入的字符串是"+st);

        //-----------------Random------------------------
        int num1 = new Random().nextInt();
        System.out.println("随机的数字是"+num1);

        String str = "abc";
        Boolean eaual1 = str.equals("122");
        //不区分大小写
        Boolean eaual2 = str.equalsIgnoreCase("ABc");
    }
}
