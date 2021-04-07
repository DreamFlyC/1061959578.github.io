package cn.dsq.no5;

public class CodeTest93ArrayParam {
    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40};
        System.out.println(array);

//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);   }
        printArray(array);
        int[] result= retrunArray(4,5,6);
        System.out.println(result);         //数组作为返回值传递的是地址值
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
    /*
    三要素：
    返回值类型：只进行打印，不需要计算，也没有结果，用void
    方法名称：printArray
    参数列表：传递数组才能打印参数
     */

    public static void printArray(int[] array ){
        System.out.println("接收的array是什么:"+array);       //数组作为参数传递的是地址值
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] retrunArray(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        int[] array = {sum,avg};
        return  array;

    }
}
