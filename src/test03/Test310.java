package test03;

import java.util.Arrays;

/**
 * Arrays的一些方法
 */

public class Test310 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = {1,2,3,4,5};
        int[] c ={1,2,3,4};
        int[] d={7,8,9,10,11};
        int[] e ={1,2,3,4,5,6};


//        b = c;
//        for(int i = 0;i<b.length;i++)
//        {
//            System.out.println(b[i]);
//        }
//
//        b= d;
//        for(int i = 0;i<b.length;i++)
//        {
//            System.out.println(b[i]);
//        }
//
//        b= e;
//        for(int i = 0;i<b.length;i++)
//        {
//            System.out.println(b[i]);
//        }

        b=e;
        e[0]=10;
        System.out.println("---------------");
        for(int element:b)
            System.out.println(element);

        System.out.println("---------------");
        e = new int[]{1, 2, 3, 4, 5, 6};
        b = Arrays.copyOf(e,b.length);
        e[0]=10;
        for(int element:b)
            System.out.println(element);

        System.out.println("---------------");
        int x1=Arrays.binarySearch(b,7);
        int x2=Arrays.binarySearch(b,3);
        System.out.println("x1="+x1+",x2="+x2);

        System.out.println("---------------");
        b=Arrays.copyOfRange(e,2,4);
        for(int r:b)
            System.out.println(r);

        System.out.println("---------------");
        boolean t1=Arrays.equals(e,b);
        System.out.println(t1);

        System.out.println("---------------");
        int[] a1={1,2,3};
        int[] a2=a1;
        int[] a3={1,2,3};
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        boolean b1 = a1.equals(a2);
        System.out.println(b1);
        System.out.println(Arrays.equals(a1,a2));
        boolean b2 = a1.equals(a3);
        System.out.println(b2);
        System.out.println(Arrays.equals(a1,a3));
    }
}
