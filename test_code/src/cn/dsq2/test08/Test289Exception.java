package cn.dsq2.test08;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable :该类是所有错误和异常的超类。 Error-->错误， Exception-->异常
        Exception： 通常是编译器异常，也有运行期异常(RuntimeException). 异常通常可以通过方法解决，使程序正确运行
        Error：错误通常需要修改源代码才能解决，编写代码的时候应该避免错误
*/
public class Test289Exception {
    //第一种处理方式：public static void main(String[] args) throws ParseException 交给JVM处理，JVM会输出异常到控制台并终止程序
    public static void main(String[] args) /*throws ParseException*/ {
        //编译异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        //第二种异常处理方法
        //使用第二种方法，程序出现异常后不会终止，会输出“后续处理”
        try {
            date = sdf.parse("2021-0223");
        } catch (ParseException e) {
            e.printStackTrace();    //java.text.ParseException: Unparseable date: "2021-0223"
        }
        System.out.println(date);
        System.out.println("后续代码");

        //第一种处理方式

    }
}
