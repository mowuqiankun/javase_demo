package com.zlk.com;

import java.lang.annotation.*;

/**
 * @description: 元注解
 *  * 1）@Target:注解能作用的位置
 *  * 2）@Retention:描述注解被保留的阶段
 *  * 3）@Documented:描述注解是否被抽取到api文档中。
 *  * 4）@Inherited:描述注解是否被子类继承
 * @author: Zlk
 * @date: 2020/3/915:02
 */

@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //该注解只能作用于类上,方法上、成员变量上。
@Retention(value = RetentionPolicy.RUNTIME)  //自定义的注解，一般取RUNTIME，会保留到class字节码中，并被JVM读取到。
@Documented
@Inherited
public @interface Dem08_MyAnno2 {
    int value();
}
