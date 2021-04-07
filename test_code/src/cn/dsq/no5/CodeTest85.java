package cn.dsq.no5;
//数组
public class CodeTest85 {
    public static void main(String[] args) {
        int[] array =new int[3];        //数组初始化
        System.out.println(array);      //数组地址值
        System.out.println(array[0]);   // 默认值  int的默认值为0
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("================");     //华丽分割线
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);      //数组地址值
        System.out.println(array[0]);   // 默认值  int的默认值为0
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("================");     //华丽分割线
        array = new int[]{1,2,3};

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
