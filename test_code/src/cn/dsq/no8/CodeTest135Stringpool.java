package cn.dsq.no8;
/*
* 字符串常量池，程序当中直接写上的双引号字符串，就在字符串常量池中。
*
* 对于基本类型来来说，==是进行数值的比较；
* 对于引用类型来说，==是进行【地址值】的比较。
* */
public class CodeTest135Stringpool {
    public static void main(String[] args) {
        String str1 ="abc";
        String str2 ="abc";

        char[]  charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println("第二个字符串："+str2);

        System.out.println(str1 ==  str2);   //true
        System.out.println(str1 == str3);   //false
        System.out.println(str2 == str3);   //false

        System.out.println("============华丽分割线");

        /*
对于引用类型来说，==是进行【地址值】的比较。如果确实需要字符串的内容比较，可以使用两个方法。

public boolean equals(object obj),  参数可以是任何对象，只有参数是一个字符串并且内容相同的才会个true,否转返回false
备注：
1.任何对象都能用Object 进行接收； Object 是所有类的父类
2.equals方法具有对称性，也就是a.equals(b） 和 b.equals(a) 效果一样
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面

public boolean equalsIgnoreCase(String str) : //忽略大小写进行内容比较

*/


        //equals 的比较

        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true
        System.out.println(str2.equals(str3));  //true
        System.out.println(str3.equals("abc")); //true
        System.out.println(str3.equals("Abc")); //false

        //实例： 推荐常量字符串写在前面的原因
        String str5 = "abc";
        System.out.println("abc".equals(str5)); //推荐
        System.out.println(str5.equals("abc")); //不推荐，加入str = null 会出现空指针异常，所以不推荐


        System.out.println("==================华丽分割线");


        //public boolean equalsIgnoreCase(String str)
        String str6 = "ABC";
        System.out.println(str5.equals(str6));                     //false
        System.out.println(str5.equalsIgnoreCase(str6));            //true
    }
}
