package cn.dsq2.test4;


import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/*
    自动拆箱与自动装箱：
        JDK1.5之后，基本类型与包装类型可以自动转换
*/
public class Test235Integer {
    public static void main(String[] args) {

        //自动装箱
        demo01();
        //自动拆箱
        demo02();
    }

    private static void demo02() {
        Integer i = 1;
        i = i+1;
        System.out.println(i.getClass().getName()); //java.lang.Integer
        int i2 = i+2;       //i 会自动转为基本类型去进行计算

        System.out.println(i2);
    }

    private static void demo01() {
        Integer i = 1; // 相当于 Integer i = new Integer（1）；
        System.out.println(i);
    }
}
