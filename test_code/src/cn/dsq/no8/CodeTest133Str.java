package cn.dsq.no8;

import java.lang.String;
/*
字符串的特点
1.字符串的内容永不可变。
2.正是因为字符串不可改变，所以字符串是可以共享使用的。
3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。

创建字符串的常见3+1种方式
三种构造方法
public String(),创建一个空白字符串，不含任何内容
pubulc String(char[] array):根据字符数组的内容，来创建对应的字符串。
pubilc String(byte[]):根据字节数组的内容，来创建对应的字符串
*/


public class CodeTest133Str {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串:"+str1);

        //根据字符数组创建字符串
        char[]  charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串："+str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三钟字符串："+str3);

        //直接创建
        java.lang.String str4 = "hello";
        System.out.println("第四个字符串:"+str4);


    }
}
