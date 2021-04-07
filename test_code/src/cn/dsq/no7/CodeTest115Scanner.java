package cn.dsq.no7;

import java.util.Scanner;   //导报

/*
* Scanner类的功能：可以实现键盘输入数据，到程序当中
*
* 引用类型的一半使用步骤；
* 1.导包      2.创建        3.使用
* 只有java.lang包下的内容不需要导包，其他包都需要import语句
* */
public class CodeTest115Scanner {
    public static void main(String[] args) {
        //创建
//        备注：System.代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        //获取Int数字：int num = sc.nextInt();
        //获取字符串:String str = sc.next（）
        //获取下一行:

        int num = sc.nextInt();
        System.out.println("输入的数字为："+num);

        System.out.println("==============");

        String str = sc.next();
        System.out.println(str);

        System.out.println("==============");

        //题目：键盘输入两个int数字，并且求出和值
        System.out.println("请输入数字a:");
        int a = sc.nextInt();
        System.out.println("请输入数字b:");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("a+b="+result);

    }
}
