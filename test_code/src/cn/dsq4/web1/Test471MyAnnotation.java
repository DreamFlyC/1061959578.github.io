package cn.dsq4.web1;

import java.lang.annotation.*;

/**
 * @author: 段市庆
 * @date: 2021/6/18 14:43
 */

@Target(value = ElementType.TYPE)   //标识注解只能作用于类上
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface Test471MyAnnotation {
    /*
        注解属性的要求：
       属性的返回值要求：基本类型、字符、枚举、注解、以上类型数组
       定义了数据，在使用时需要给属性赋值
       如果只有一个属性需要赋值，并且属性的名称是valuer，则value可以省略

        元注解：
            @Target(value = ElementType.TYPE)  ：描述注解能够作用的位置
                ElementType取值：
                    TYPE：可以作用于类上
                    METHOD：可以作用于方法上
                    FIELD:可以作用于成员变量上
            @Retention：描述注解被保留的一个阶段
                @Retention(value = RetentionPolicy.RUNTIME):当前被描述的注解，会保留到class字节码文件中，并被JVM读取到
            @Documented：描述注解是否被抽取到Api文档中
            @Inherited：描述注解是否被子类集成


    */

    public abstract String show();
    public abstract String show2() default "张三";
}
