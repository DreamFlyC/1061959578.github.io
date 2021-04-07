package cn.dsq2.test2;

import java.util.Calendar;
import java.util.Date;

/*
    java.util.Calendar.  抽象类
      作用：提供了很多操作日历字段的方法（YEAR,MONTH,DAY_OF_MONTH,HOUR等
      Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
       Calendar rightNow = Calendar.getInstance();
      static CalendargetInstance() ; 使用默认时区和语言环境获得一个日历。
*/
public class Test225DemoCalendar {
    public static void main(String[] args) {
        demo1();        //Calendar类的简单使用
        /*
            Calendar类常用方法有：
                 int	get(int field) :返回给定日历字段的值。
                 void	set(int field, int value):将给定的日历字段设置为给定值。
                 abstract  void	add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
                 Date	getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
        */
        // int	get(int field) :返回给定日历字段的值。
        demo02();
        //void	set(int field, int value):将给定的日历字段设置为给定值。
        demo03();
        //abstract  void	add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        demo04();
        //Date	getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
        demo05();
    }

    private static void demo05() {
        Calendar c= Calendar.getInstance();
        Date date= c.getTime();
        System.out.println(date);
    }

    private static void demo04() {
        Calendar c= Calendar.getInstance();
        c.add(Calendar.YEAR,9);     //现在的年份加9
        int year = c.get(Calendar.YEAR);   //Calendar.YEAR = 1 类的静态字段
        int month = c.get(Calendar.MONTH);   //Calendar.MONTH = 2 类的静态字段
        int day = c.get(Calendar.DAY_OF_MONTH);   //Calendar.MONTH = 5 类的静态字段
        System.out.println("现在时间是："+year+"年"+(month+1)+"月"+day+"号");    //西方月份为0-11月 所以加1
    }

    private static void demo03() {
        Calendar c= Calendar.getInstance();
        c.set(Calendar.YEAR,2040); //设置Year为2040年
//        c.set(2044,12,11);        也可以同时设置年月日
        int year = c.get(Calendar.YEAR);   //Calendar.YEAR = 1 类的静态字段
        int month = c.get(Calendar.MONTH);   //Calendar.MONTH = 2 类的静态字段
        int day = c.get(Calendar.DAY_OF_MONTH);   //Calendar.MONTH = 5 类的静态字段
        System.out.println("现在时间是："+year+"年"+(month+1)+"月"+day+"号");    //西方月份为0-11月 所以加1
    }

    private static void demo02() {
        Calendar c= Calendar.getInstance();
        int year = c.get(Calendar.YEAR);   //Calendar.YEAR = 1 类的静态字段
        int month = c.get(Calendar.MONTH);   //Calendar.MONTH = 2 类的静态字段
        int day = c.get(Calendar.DAY_OF_MONTH);   //Calendar.MONTH = 5 类的静态字段
        System.out.println("现在时间是："+year+"年"+(month+1)+"月"+day+"号");    //西方月份为0-11月 所以加1
    }

    private static void demo1() {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);
    }
}

