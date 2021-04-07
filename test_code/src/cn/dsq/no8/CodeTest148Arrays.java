package cn.dsq.no8;


/*
* java.util.Arrays 是一个与数组相关地工具类，里面提供了大量静态方法，用来实现数组常见地操作
*
* public static String toString(数组):将参数数组变成字符串(按照默认格式)
*
* public static void sort(数组):按照默认升序(从小到大)对数组进行排序
*
* 备注：
* 1.如果是数字，sort默认按照升序从小到大
* 2.如果是字符串，sort默认按照升序
* 3.如果是自定义类型，那么这个自定义地类需要有Comparable 或 Comparator 接口的支持
* */

import java.util.Arrays;

public class CodeTest148Arrays {
    public static void main(String[] args) {
        int[] intArray ={10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);  //[10, 20, 30]

        int[] array1 = {2,3,5,8,4,0,1};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
