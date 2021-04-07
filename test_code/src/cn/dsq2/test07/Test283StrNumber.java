package cn.dsq2.test07;

import java.util.HashMap;
import java.util.Scanner;

/*
    练习：计算一个字符串中每个字符出现的次数
*/
public class Test283StrNumber {
    public static void main(String[] args) {
        //获取用户输入字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的字符:");
        String str = sc.next();
        System.out.println(str);

        //创建Map几个，用Key存储字符，value存储字符个数
        HashMap<String, Integer> map = new HashMap<>();

        //遍历字符，进行判断存储到map集合中
        for (char c : str.toCharArray()) {
            String cc=String.valueOf(c);
            //判断字符是否为新字符
            if(map.containsKey(cc)){
                Integer i =map.get(cc)+1;
                map.put(cc,i);
            }else{
                map.put(cc,1);
            }
        }
        System.out.println(map);    //{f=1, g=1, h=4, j=4}
    }
}
