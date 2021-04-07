package cn.dsq2.test07;

/*
    Debug调式程序：
        可以让代码逐行执行，查看代码的执行过程，调试程序出现的BUG
*/
public class Test285Debug {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=10;
        int d=10;
        int sum = a+b+c+d;
        System.out.println(sum);

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
}
