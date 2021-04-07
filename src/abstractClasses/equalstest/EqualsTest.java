package abstractClasses.equalstest;

import java.util.Arrays;

public class EqualsTest {
    public void test()
    {
        System.out.println("equals方法测试");
    }

    public EqualsTest getthis(){
        return this;
    }

    public static void main(String[] args) {
        EqualsTest a =new EqualsTest();
        EqualsTest b = new EqualsTest();
        System.out.println(a.equals(b));   // 用equals 方法比较对象a,b
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getthis());
        System.out.println(b.getthis());  //对比equals的方法， 由此可知equals 就是对比a ,b 两对象输出的这个值。这个值具体是什么，以后再分析

        System.out.println("分割----------------------");

        Equalsson c =new Equalsson();
        System.out.println(c);
        System.out.println(a);
        System.out.println(c instanceof EqualsTest);
        System.out.println(a instanceof EqualsTest);
        System.out.println(c.equals(a));
        System.out.println(a.equals(c));

        System.out.println("分割----------------------");

        int[] aa={1,2};
        int[] cc={1,2};
        System.out.println(aa.hashCode());
        System.out.println(cc.hashCode());
        System.out.println(Arrays.hashCode(cc));
//        hashCode(int[] cc={1,2});

        System.out.println("分割----------------------");
        float aaa =5.223f;
        System.out.println(Float.hashCode(aaa));
//        System.out.println(Float.hashCode(float ccc = 4.233f));  // 括号里面不能传递表达式
    }
}

class Equalsson extends EqualsTest{
    @Override
    public int hashCode() {
        int a=5;
        String b="ascd";
        return  Long.hashCode(a);
    }
}
