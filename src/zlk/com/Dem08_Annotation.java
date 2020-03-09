package zlk.com;

/**
 * @description: 注解
 * 一：概念：说明程序的，给计算机看得。
 * 二：定义：也叫元数据，一种代码级别的说明，JKD1.5后引入的特性，与类、接口、枚举是同一个层次。它可以声明在包、类、字段、方法、
 * 三：局部变量、方法参数等的前面，用来对这些元素进行说明、注释。
 * 四：概念说明：
 * 1）JDK1.5后的新特性。
 * 2）说明程序的
 * 3）使用注解：@注解名称
 *
 * 五：作用与分类：
 * 1）编写文档：通过代码里面标识的注解，生成doc文档
 * 2)代码分析：通过注释，对代码进行分析（使用反射）
 * 3）编译检查：
 *
 * 六：java中预定义的一些注解：
 * 1）@Override：检测被改注释标注的方法是否是继承自父类（接口）的；
 * 2）@Deprecated:该注解标注的内容，标识已经过时。
 * 3)@SuppressWarnings:压制警告。
 *
 * 七：元注解：用于描述注解的注解；
 * 1）@Target:注解能作用的位置
 * 2）@Retention:描述注解被保留的阶段
 * 3）@Documented:描述注解是否被抽取到api文档中。
 * 4）@Inherited:描述注解是否被子类继承
 *
 * 八：在程序中使用（解析）注解：获取注解中定义的属性值
 * 1）获取注解定义的位置对象（Class,Method,Filed）
 * 2)获取指定的注解; getAnnotation(Class)
 * 3)调用注解中的抽象防范，获取返回值。
 *
 * 小结：
 * 1）以后大多数我们会使用注解。
 * 2）注解给谁用？  编译器、解析程序。
 * 3）注解不是程序的一部分，可以理解注解就是一个标签。
 *
 * @author: Zlk
 * @date: 2020/3/910:30
 */
//@SuppressWarnings("all")
    //自定义。
    //@Dem08_MyAnnotation(name = "zlk")
    //@Dem08_MyAnnotation("5") //唯一需要赋值，名称为value，可以省略不写。等同于下面
    //@Dem08_MyAnnotation(value = "5") //唯一需要赋值，名称为value，可以省略不写。
    @Dem08_MyAnno1(value = "zlk",strArrays = {"1","2"})
    @Dem08_MyAnno2(3)
public class Dem08_Annotation {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    @Dem08_MyAnno2(value = 3)
    public int add(int a){
        return a;
    }


}
