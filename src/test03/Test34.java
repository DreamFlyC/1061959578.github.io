package test03;

public class Test34 {
//    类常量，使用关键字static final 。final指示常量，表示该变量只能赋值一次
    public static final int CM_TEST = 12;

    public static void main(String[] args) {
//        CM_TEST = 13 ；  如果再次赋值会报错
//        enum AA  {1,2,3,4};
//        Hi say = Hi.goodmorning
        double x = 4;
        double y = Math.sqrt(4);
        System.out.println(y);
        int z = 4 ;
        y = Math.sqrt(z);
        System.out.println(y);

//        #强制转换
        float a = 3.4f;
        float b = 4.3f;
        int c = 0;
        c =(int)a + (int)b;
        System.out.println(c);

        c=0;
        c=1+(c++);
        System.out.println(c);
        c = 0;
        c=1+(++c);
        System.out.println(c);

    }
}
