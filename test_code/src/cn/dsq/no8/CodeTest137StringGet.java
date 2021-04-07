package cn.dsq.no8;

/*
* String 当中与获取相关的常用方法有：
*
* public int length():获取字符串当中含有的字符个数，拿到字符串长度
* public String concat(String str): 将当前字符串和参数字符串拼接成为返回值的新字符串
* public char charArt(int index)： 获取指定索引位置的单个字符(索引从0开始)
* public int indexOf(String str):查找参数字符串在本字符串首次出现的索引位置，如果没有则返回-1值
*
* 字符串的截取方法
* public String substring(int index)截取从参数位置一致到字符串末尾，返回新字符串
* pubulic String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串。左闭右开
*
*
* String当中与转换相关的常用方法有：
* public char[] toCharArray():将当前字符串拆分成字符数组作为返回值
* public byte[] getBytes(): 获得当前字符串底层的字节数组
* public String replace(CharSequence oldString,CharSequence newString)
*CharSequence 意思就是说可以接收字符串类型
*
*
* 字符串分割
* public String[] split(String regex): 按照参数的规则，将字符串切分成为若干部分
* split 方法参数其实是一个"正则表达式"，如果堆英文句点"." 进行切分，必须写"\\." (两个反斜杠)
*  */

import javax.lang.model.element.NestingKind;

public class CodeTest137StringGet {
    public static void main(String[] args) {
        System.out.println("=======================字符串长度，以及字符串拼接");
        String a = "asdqwfsfsdfwadasdasf";
        System.out.println("字符串长度是:"+a.length());

        //拼接字符串
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);   //helloworld，是新的字符串

        System.out.println("================华丽的分割线，获取指定索引字符，以及查找指定字符索引");

        //获取指定索引的单个字符
        char ch =str1.charAt(1);
        System.out.println("str1的1号索引位置字符是："+ch);

        //查找参数字符串在本来字符串当中出现的第一次索引位置，没有则返回-1
        System.out.println(str1.indexOf("ll"));         //2
        System.out.println(str1.indexOf("hee"));        //-1

        System.out.println("================华丽的分割线,截取字符串");

        //截取字符串 substring()
        System.out.println(str3);
        String str7 = str3.substring(2);
        System.out.println(str7);
        String str8 =str3.substring(2,5);
        System.out.println(str8);

        System.out.println("=================字符串的转换");
        //转换为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换为字节数组
        byte[] bytes = "world".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(bytes.length);

        //字符串的内容替换
        String str9 = "how do you do ";
        System.out.println(str9);
        String str10 = str9.replace("o","*");
        System.out.println(str10);


        //字符串的切割
        System.out.println("================字符串切割=============");

        String strr = "aaa,bbb,ccc";  //这是一个字符串，只有一个双引号
        String[] array1 = strr.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


        // 用 " . "  切分的化会出错
        System.out.println("注意事项");
        String strr2 = "xxx.yyy.ccc";      //
        String[] array2 = strr2.split(".");
        System.out.println(array2.length);  //0
        String[] array3 = strr2.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }





    }
}
