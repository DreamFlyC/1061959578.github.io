package test04;

import java.time.LocalDate;
import java.util.Date;

public class Test41 {
    public static void main(String[] args) {

        //构造一个对象 new Date()
        //构造一个对象，并将这个对象传哥方法
        System.out.println(new Date());

        //构造一个对象，然后调用一个方法。并将定义一个变量指向结果
        String s = new Date().toString();
        System.out.println(s);

        //构造一个对象，并定义赋值给一个对象变量.

        Date birthday = new Date();
        System.out.println(birthday);

        //LocalDate
        LocalDate dateone = LocalDate.of(2020,9,10);
        LocalDate datetwo =dateone.plusDays(1000);
        //dateone 调用plusdays 后 生成一个心对象，本身并没有改变
//        只访问对象而不修改对象的方法有时称为访问器方法
        System.out.println(dateone);
        System.out.println(datetwo);

        int today = dateone.getDayOfMonth();
        dateone = dateone.minusDays(today -1); //当前10号  - （10-1） 所以是第一天
        System.out.println(dateone);
    }
}
