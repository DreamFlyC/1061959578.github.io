package cn.dsq2.test2;

import java.util.Date;

/*
    java.util.Date: 表示日期和时间的类
    毫秒转换为日期：
        1天=24*60*60=86400秒 = 86400000毫秒
*/
public class Test220DemoDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());     //获取当前系统时间到1970年1月1日00:00:00（英国格林威治经历了多少毫秒
        //无参构造
        demo01();       //Tue Feb 16 23:06:42 CST 2021
        //有参构造
        demo02();       //Thu Jan 01 08:02:03 CST 1970
        //成员方法
        demo03();
        //

    }

    private static void demo03() {
        Date date =new Date();
        long s = date.getTime(); //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
        System.out.println(s);
    }

    private static void demo02() {
        Date date = new Date(1231231323L);
        System.out.println(date);
    }

    /*
        Date类的空参数构造方法：
            Date（） 获取当前系统的日期和时间
    */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }

}
