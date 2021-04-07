package cn.dsq.no8;


/*
对于引用类型来说，==是进行【地址值】的比较。如果确实需要字符串的内容比较，可以使用两个方法。

public boolean equals(object obj),  参数可以是任何对象，只有参数是一个字符串并且内容相同的才会个true,否转返回false
备注：任何对象都能用Object 进行接收； Object 是所有类的父类
*/
public class CodeTest136StringEquals {
    public static void main(String[] args) {
        String str1 ="abc";
        String str2 ="abc";

        char[]  charArray = {'A','B','C'};
        String str3 = new String(charArray);
        System.out.println("第二个字符串："+str2);

        System.out.println(str1.equals(str2));

    }
}
