package cn.dsq.no7;


import  java.util.Random;

public class CodeTest121Random {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是:"+num);

//        参数需要大于0
//        int num2 =r.nextInt(-100);
//        System.out.println(num2);

        int num3 = r.nextInt(100);
        System.out.println(num3);
    }

}
