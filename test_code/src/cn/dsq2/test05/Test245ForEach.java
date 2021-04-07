package cn.dsq2.test05;

import java.util.ArrayList;
import java.util.Arrays;

/*
        增强for循环，for each  -->用来遍历集合和数组
        原理：
            public interface Collection<E> extends Iterable<E>
            public interface Iterable<T>    ：实现这个接口允许对象成为 "foreach" 语句的目标。
        格式：
            for（集合/数组的数据类型 变量名：集合名/数组名）{
                sout(变量名)
            }
*/
public class Test245ForEach {
    public static void main(String[] args) {
        //使用for each
        demo01();
        
    }

    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i:arr
             ) {
            System.out.println(i);
        }
        ArrayList<String > al = new ArrayList<>();
        al.add("a");
        al.add("a");
        al.add("b");
        al.add("c");
        for (String sr:al
             ) {
            System.out.println(sr);
        }
    }
}
