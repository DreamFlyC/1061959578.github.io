package cn.dsq.no8;


import java.util.Scanner;

public class CodeTest141Stringwork {
    public static void main(String[] args) {
        /*
        * 题目一：
        * 定义一个方法，把数组{1,2,3} 奥找指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]
        * */

        int[] list = {1,2,3};
        String str =getString(list);
        System.out.println(str);

        System.out.println("============第二题");
        /*
        * 题目二：
        * 键盘输入一个字符串：并统计其中各个字符出现的次数
        * 种类有：大小写字母、数字、其他
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个字符串");
        String input = sc.next();
        char[] ch =input.toCharArray();
        //定义4个变量来统计次数
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < ch.length; i++) {
            char xx = ch[i];
            if('A'<=xx && xx<='Z'){
                countUpper++;
            }else if('a' <= xx && xx<='z'){
                countLower++;
            }else if('0'<= xx && xx <='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }

        System.out.println("大写字母有"+countUpper);
        System.out.println("小写字母有"+countLower);
        System.out.println("数字有"+countNumber);
        System.out.println("其他字符有"+countOther);


    }
    //题目一方法
    public static String getString(int[] list){
        String str ="[";
        for (int i = 0; i < list.length; i++) {
            if(i == list.length-1){
                str += list[i]+"]";
            }else{
                str += list[i]+"#";
            }
        }
        return str;
    }
}
