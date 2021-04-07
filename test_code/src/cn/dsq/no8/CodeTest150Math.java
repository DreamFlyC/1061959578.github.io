package cn.dsq.no8;


/*
* java.util.Math 类是Math数学相关的工具类,里面提供了大量的静态方法，完成与数学运算线管的操作。
*
* public static double abs(double num)，获取绝对值。 有多种重载
* public static double ceil(double num),向上取整.
* publice static double floor(double num):向下取整
* publice static long round(double num):四舍五入
*
* Math.PI :代表圆周率的常量
* */
public class CodeTest150Math {

    public static void main(String[] args) {

        //获取绝对值  //不一定是要求是double类型，有多种重载
        int a = 0;
        System.out.println(Math.abs(a));        //0__init__(
        System.out.println(Math.abs(-1.233));   //1.233


        //向上取整
        System.out.println(Math.ceil(3.9));     //4.0
        System.out.println(Math.ceil(41));      //41.0

        //向下取整
        System.out.println(Math.floor(3.9));    //3.0
        System.out.println(Math.floor(41));     //41.0

        //四舍五入
        System.out.println(Math.round(3.9));    //4
        System.out.println(Math.round(3.4));    //3



    }
}
