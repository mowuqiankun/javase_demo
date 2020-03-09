package zlk.com;

/**
 * @description: 类
 * 一：构造方法是专门用来创建对象的方法，new创建对象，就是调用此方法。
 * 1、构造方法名称和类名称完全一样。
 * 2、构造方法不能写返回值，void不可以。
 * 3、构造方法不能用return一个具体的返回值。
 * 4、如果没有编写任何构造方法，编译器会默认赠送一个构造方法，没有参数、方法体什么事情都不做。
 * 5、一旦编写了一个构造方法，编译器将不再赠送默认构造方法。
 *
 * 二：标准的类（Java Bean）
 * 1、所有的成员变量都要用private关键字修饰。
 * 2、为一个成员变量编写一对Getter/Setter方法。
 * 3、编写一个无参的构造方法。
 * 4、编写一个全参数的构造方法。
 *
 * 三：面向对象三大特性
 * 封装、继承、多态
 *
 * 四：类，一组相关属性和行为的集合。
 * 1、属性：状态信息
 * 2、行为：能做什么
 *
 * 五、匿名对象，只有右边new 部分。
 *
 * @author: Zlk
 * @date: 2020/3/514:29
 */
public class Dem05_Person {
    //成员变量
    private String name; //名字
    private int age; //年龄

    //无参构造方法
    public Dem05_Person(){
        System.out.println("无参构造方法已执行。");
    }

    //有参构造方法
    public Dem05_Person(String name, int age){
        System.out.println("两个参数构造方法已执行。");
        this.name=name;
        this.age=age;
    }

    //注意成员变量和局部变量。
    public void sayHello(String name){
        System.out.println(name+",你好，我是"+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
