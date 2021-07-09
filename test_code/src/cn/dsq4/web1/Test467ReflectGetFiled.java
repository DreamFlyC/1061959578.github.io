package cn.dsq4.web1;

/**
 * @author: 段市庆
 * @date: 2021/6/16 11:21
 */

/*
    获取class对象的方式：
    class.forName("全类名")：将字节码文件加载进内存，返回class对象
    类名.cass： 通过类名的属性class 获取Class对象
    对象.getClass(): Object中定义的方法.
*/
public class Test467ReflectGetFiled {
    public static void main(String[] args) throws ClassNotFoundException {
        //
        Class personCls1 = Class.forName("cn.dsq4.web1.Test467Person");
        System.out.println(personCls1);

        Class<Test467Person> personCls2 = Test467Person.class;
        System.out.println(personCls2);

        Class<? extends Test467Person> personCls3 = new Test467Person().getClass();
        System.out.println(personCls3);

        //==比较三个对象
        System.out.println(personCls1 == personCls2);//true
        System.out.println(personCls1 == personCls3);//true

    }
}
