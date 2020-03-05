package com.zlk.com;


import java.lang.reflect.Array;

/**
 * @description: 数组:容器
 * 一：数组特点：
 * 1、数组是引用类型，可以存放多个数据值。
 * 2、数组中的多个数据，类型必须统一。
 * 3、数组的长度在运行期，长度不可改变。
 *
 * 二：数组初始化：在内存中创建一个数组，并且向其中赋予一些默认值。两种常见的初始化方法
 * 1、动态初始化：指定长度。== 数据类型[] = new 数据类型[数组长度]
 * 2、静态初始化：
 *  1)不直接指定长度，而是直接指定内容。
 *  2)省略格式:
 *
 *  注意：
 *  1、静态初始化没有直接指定长度，但是仍然会自动推算到长度。
 *  2、如果不知道数组数据，用动态初始化；如果已知数组内容，用静态初始化；
 *  3、动态初始化元素将自动拥有一个默认值。规则如：
 *     1）如果是整数类型(byte,short,int,long)，默认为0；
 *     2）如果是浮点类型(float,double)，默认为0.0；
 *     3）如果是字符类型(char)，那么默认为'|u0000'
 *     4)如果是布尔类型(boolean)，那么默认为false;
 *     5)如果是引用类型,默认为null.
 *  4、静态初始化其实也有默认值的过程，系统马上自动将默认值替换为大括号中的具体数值。
 *
 *  三、java内存
 *  1、栈(Stack):存放的都是方法中的局部变量。方法的运行一定要在栈当中进行。
 *     局部变量：方法的参数，或者是方法{}内部的变量。
 *     作用域：一旦超出作用域，立马从栈内存中消失。
 *  2、堆（Heap）:凡是new出来的东西，都在堆里面。
 *     堆内存里面的东西都有一个地址值：16进制。
 *     堆内存的数据，都有默认值。
 *  3、方法区(Method Area):存储.class相关信息，包含方法的信息。如main方法
 *
 *  4、本地方法栈(native Method Stack):与操作系统相关。
 *  5、寄存器（pc Register）:与CPU相关。
 *
 *  四：直接打印数组，得到的是数组在内存中的地址哈希值。
 * @author: Zlk
 * @date: 2020/3/59:14
 */
public class Dem04_Array {
    public static void main(String[] args) {

        //动态初始化
        int[] array1 = new int[5];
        printlnArrays(reversal(array1));

        //静态初始化
        String[] array2 = new String[]{"6", "7", "8", "9"};
        printlnArrays(array2);

        //静态初始化省略格式
        int[] arrays = {1, 2, 3, 4, 5};
        printlnArrays(reversal(arrays));
    }

    /**
     * 方法一：数组元素的反转：要求不能用新的数组;
     *
     * @param arrays int数组
     * @return int数组
     */
    private static int[] reversal(int[] arrays) {
        if (arrays.length > 0) {
            int min = 0; //数组首位
            int max = arrays.length - 1;//数组末尾位
            int temp;  //用于交换位置

            while (min < max) {
                temp = arrays[min];
                arrays[min] = arrays[max];
                arrays[max] = temp;
                min += 1;
                max -= 1;
            }
        }
        return arrays;
    }

    /**
     * 打印int型数组
     *
     * @param arrays 数组
     */
    private static void printlnArrays(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("第" + (i + 1) + "位：" + arrays[i]);
        }
    }

    /**
     * 打印String型数组
     *
     * @param arrays 数组
     */
    private static void printlnArrays(String[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("第" + (i + 1) + "位：" + arrays[i]);
        }
    }
}
