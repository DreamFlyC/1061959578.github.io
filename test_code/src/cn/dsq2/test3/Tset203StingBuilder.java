package cn.dsq2.test3;

/*
        java.lang.StringBuilder   字符串缓冲区
        常用构造方法：
            StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
            StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串内容。
        常用方法：
             StringBuilder	append()：将 参数的字符串表示形式追加到序列,并返回当前函数自身
              String	toString()：返回此序列中数据的字符串表示形式。
*/
public class Tset203StingBuilder {
    public static void main(String[] args) {
        //StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);     //bu1:

        //StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);     //bu2:abc

        //StringBuilder	append()：将 参数的字符串表示形式追加到序列。
        demo01();
        //String	toString()：返回此序列中数据的字符串表示形式。
        demo02();
    }

    private static void demo02() {
        /*
            String->StringBuilder
            StringBuilder->String
        */
        String str = "hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println("bu:"+bu);
        String str2 = bu.toString();
        System.out.println("str2:"+str2);
    }

    private static void demo01() {
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = b1.append("abc");
        System.out.println("b1:"+b1);
        System.out.println("b2:"+b2);
        System.out.println("b1==b2:"+(b1==b2)); //并返回当前函数自身
        //所以使用appne（）方法可以不需要接受返回值
        b2.append("ef");
        System.out.println("b2:"+b2);
        /*
            tip：
                链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
        */
    }
}
