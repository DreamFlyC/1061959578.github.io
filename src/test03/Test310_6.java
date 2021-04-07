package test03;


import java.util.Scanner;
import java.util.Arrays;

public class Test310_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("要抽取的随机数个数");
        int k=in.nextInt();

        System.out.println("样本个数");
        int n=in.nextInt();

        int[] number=new int[n];
        for(int i =0;i<number.length;i++)
        {
            number[i]=i+1;
        }

        int[] result=new int[k];
        for(int i =0; i<result.length;i++)
        {
            int r=(int) (Math.random()*n);

            result[i] = number[r];
            number[r]=number[n-1];
            n--;
        }

        Arrays.sort(result);
        for(int r:result)
            System.out.println(r);


    }
}
