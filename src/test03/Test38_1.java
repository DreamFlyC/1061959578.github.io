package test03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test38_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("你退休需要多少工资？");
        double goal = in.nextDouble();

        System.out.println("你每年增加多少工资?");
        double payment = in.nextDouble();

        System.out.println("利率是多少？");
        double intRate = in.nextDouble();

        double balance = 0;
        int yaers =0;

        while (balance<goal)
        {
            balance+=payment;
            double interest = balance* intRate/100;
            balance+=interest;
            yaers++;
        }

        System.out.println("你可以在"+yaers+"退休");

    }
}
