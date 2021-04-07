package test03;

public class Test36 {
    public static void main(String[] args) {
//        提取字符串字串
        String greeting = "hello";
        String s = greeting.substring(0,3);     //赋值从0开始，到3结束，不包含3
        System.out.println(s);
        System.out.println("-----------------------");

//       以特定拼接符拼接字符串。  可以使用+拼接字符串
        s="CCACBCD";
        String a = String.join("c","c","a","b","d");
        System.out.println(a);
        System.out.println("-----------------------");

        System.out.println(a.equals(s));  //进行字符串比较
        System.out.println(a.equalsIgnoreCase(s));  //忽略大小写进行字符串比较
        System.out.println("---------------");
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0,greeting.length());
        System.out.println(n);
        System.out.println(cpCount);

    }
}
