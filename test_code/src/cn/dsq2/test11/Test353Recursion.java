package cn.dsq2.test11;

import java.io.File;

public class Test353Recursion {
    public static void main(String[] args) {
        //1~n求和
        int num1 = demo01(5);
        System.out.println("n的递归求和值:"+num1);

        //n的阶乘
        int num2 = demo02(5);
        System.out.println("n的递归阶乘值："+num2);

        //打印多级目录
        File file = new File("test_code\\src\\cn\\dsq");
        demo03(file);
    }

    private static void demo03(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {

            //递归 遍历目录
            if (file1.isDirectory()){
                demo03(file1);
            }else{
                System.out.println(file1);
            }

        }
    }



    private static int demo02(int n) {
        if(n==1){
            return 1;
        }
        return n*demo02(n-1);
    }

    private static int demo01(int n) {
        if(n==1){
            return 1;
        }
        return n+demo01(n-1);
    }
}
