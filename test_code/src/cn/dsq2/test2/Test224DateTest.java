package cn.dsq2.test2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
    练习：
        使用日期时间先关的API，计算出一个人已经出生多少天了：
    分析：
        1.使用Scanner类中的方法next,获取出生日期
        2.使用DateFormat类中的parse方法，把字符串格式的出生日期解析为Date格式
        3.把date格式的出生日期转换为毫秒值
        4，获取当前日期，转换为毫秒值
        5.计算出生日期与当前日期的毫秒差
        6.把毫秒差转换为天

*/
public class Test224DateTest {
    public static void main(String[] args) throws ParseException {
        //获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请按照yyyy-MM-dd的格式输入你的出生日期");
        String bd = sc.next();
        //2.使用DateFormat类中的parse方法，把字符串格式的出生日期解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(bd);
        //3.把date格式的出生日期转换为毫秒值
        long dbtime =date.getTime(); //获取当前日期到1970的毫秒
        //4，获取当前日期，转换为毫秒值
        Date newdate = new Date();
        long newtime=newdate.getTime();
        //5.计算出生日期与当前日期的毫秒差
        long time  = newtime - dbtime;
        //6.把毫秒差转换为天
        System.out.println(time/100/60/60/24+"天");


    }
}
