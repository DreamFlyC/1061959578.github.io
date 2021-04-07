package cn.dsq2.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.util.DateFormat：是日期/时间格式化子类的抽象类
    作用：
        格式化：日期-->文本
        解析：文本-->日期
     成员方法：
        String format(Date date)        将一个 Date 格式化为日期/时间字符串。
        Date parse(String source)       从给定字符串的开始解析文本，生成一个Date日期    Wed Feb 17 11:24:38 CST 2021。
     DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

     java.text.SimpleDateFormat   extends DateFormat
        构造方法：
            SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
                模式：  y年 M月 d天 H小时 m分钟 s秒(区分大小写)
*/
public class Test222DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();       //format();
        demo02();       //parse（）
    }

    /*
         注意:
            public Date parse(String source) throws ParseException
            parse方法声明了一个异常叫ParseException解析异常，如果字符串和构造方法中模式不一样，那么程序就会抛出异常
            调用一个抛出异常的方法，就必须处理这个异常，要么throws继续声明抛出这一个异常，要么try...cathc自己处理异常
    */
    private static void demo02() throws ParseException {
        System.out.println("demo2 执行结果");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String ss = "2021年02月17日 11时24分38秒";
        Date date= sdf.parse("2021年02月17日 11时24分38秒");
        System.out.println(date);
    }

    /*
        String format(Date date)        将一个 Date 格式化为日期/时间字符串。
    */
    private static void demo01() {
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //tip java中char类型的值用单引号括起来， 双引号表示字符串 一个或多个字符
        Date date = new Date();
        String ss = sdf.format(date);
        System.out.println(date);       //Wed Feb 17 11:23:30 CST 2021
        System.out.println(ss);         //2021年02月17日 11时24分38秒
    }
}
