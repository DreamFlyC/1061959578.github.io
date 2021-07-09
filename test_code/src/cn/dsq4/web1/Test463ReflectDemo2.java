package cn.dsq4.web1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author: 段市庆
 * @date: 2021/6/16 15:17
 */

/*
class对象的获取功能呢
    获取成员变量们
    Field		getField(String name)       获取指定名称public修饰的成员变量的
    Field[]		getFields()                 获取所有public修饰的成员变量的
    Field		getDeclaredField(String name)       获取所有成员变量
    Field[]		getDeclaredFields()                 获取指定名称变量
    获取构造方法们、获取成员方法们、获取类名
    Constructor<T>		getConstructor(Class<?>... parameterTypes)、、、、、、
    Method[]	getMethods()、、、、、
    String	getName()
*/
public class Test463ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class personCls1 = Class.forName("cn.dsq4.web1.Test467Person");
        System.out.println(personCls1);

        System.out.println("获取对象pubulice成员变量----------");
        Field[] fields = personCls1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println(personCls1.getField("pname"));


        System.out.println("获取对象所有成员变量----------");
        Field[] declaredFields = personCls1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field name = personCls1.getDeclaredField("name");
        //由于成员变量为privete修饰，我们需要使用暴力反射
        name.setAccessible(true);//暴力反射
        Object o = name.get(new Test467Person());
        System.out.println(o);

        System.out.println("获取对象pubulic构造方法----------");
        Constructor[] constructors = personCls1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor constructor = personCls1.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object o1 = constructor.newInstance("zhangsan",15);
        System.out.println(o1);     //新增对象


        System.out.println("获取对象pubulic成员方法----------");
        Method[] methods = personCls1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Method eat = personCls1.getMethod("eat",String.class);
        System.out.println(eat);
        //----------执行方法
        eat.invoke(o1,"饭");

        System.out.println("获取类名----------");
        String name1 = personCls1.getName();
        System.out.println(name1);

    }
}
