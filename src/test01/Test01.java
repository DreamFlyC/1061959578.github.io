package test01;

/*
一个简单的java程序
 */


import java.awt.*;

public class Test01 {
    public static void main(String[] args)
    {
        System.out.println("Mr GUO,good morning");
//        这里我们使用System.out对象并调用它的println方法。(.)用于调用方法。java使用的通用语法是object.method(parameters)
//        println输出字符串后，会终止这个输出行，所以每次调用println都会再新的一行显示输出
        System.out.println("Are you off this Saturday");


        Point a =new Point();
        System.out.println(a.toString());
    }
}

//关键字public称为访问修饰符(acces modifier)，这些修饰符用于控制程序的其他部分对这段代码的访问级别
//关键字class表明java程序种全部内容都包含再类中
//类名，类名必须以字母开头，后面可以跟字母和数字的任意组合，但是我们类名通常每个单词首字母大写
//源代码的文件名必须与公柜类的名字相同，并且,java作为扩展名.(注意大小写)
//java中任何方法都用'{'开始,用'}'结束
//每个java应用程序都必须有一个main方法
//Java中每个语句必须用分号结束
