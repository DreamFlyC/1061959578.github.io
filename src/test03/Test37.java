package test03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test37 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner in =new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = in.nextLine();
        System.out.println(name);
        System.out.println("你能带我飞不?");
        String result = in.next();
        System.out.println(result);
//        next()遇到空格回结束输入，nextLine()遇到空格符不会结束输入

        PrintWriter file = new PrintWriter("mytext.txt", String.valueOf(StandardCharsets.UTF_8));
//        Scanner in2 = new Scanner(Path.of("mytest.txt"),StandardCharsets.UTF_8);


    }
}
