package cn.dsq.no7;


import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1-33的 随机整数


*/
public class CodeTest129ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(32)+1;
            list.add(num);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=============华丽的分割线");

        //130 存储自定义对象
        Person one = new Person("czp",25);
        Person two = new Person("lx",25);

        ArrayList<Person> j307 = new ArrayList<>();
        j307.add(one);
        j307.add(two);

        for (int i = 0; i < j307.size(); i++) {
            System.out.println("我是:"+j307.get(i).getName()+";我的年龄:"+j307.get(i).getAge());
        }


        System.out.println("=============华丽的分割线");


        //指定格式输出  {
        System.out.print("{");
        for (int i = 0; i < j307.size(); i++) {
            Person a = j307.get(i);
            if(i == j307.size()-1){
                System.out.print(a.getName()+"}");
            }else {
                System.out.print(a.getName()+"和");
            }
        }
        System.out.println();
        System.out.println("=============华丽的分割线");


/*
        用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
        要求适用自定义方法实现
*/
        ArrayList<Integer> bigList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;  //1~100
            bigList.add(num);
        }
        System.out.println(getSmallList(bigList));

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        /*对接收的大集合进行筛选*/
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return   smallList;


    }
}
