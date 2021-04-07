package cn.test;

public class Test {
    public static void main(String[] args) {
        float sum=0l;
        float y=1l;
        float x=1l;

        for (int i = 0; i < 11; i++) {
            sum+=y/x;
            System.out.println("第"+i+"次:"+y+"/"+x+"等于"+sum);
            x=y+x;
            y=x-y;


        }
        System.out.println(sum);
    }
}
