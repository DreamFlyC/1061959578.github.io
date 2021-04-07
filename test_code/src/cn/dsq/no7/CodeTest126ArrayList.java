package cn.dsq.no7;


import java.util.ArrayList;

/*
Arraylist集合的长度是可以改变的

对于ArrayList来说，<>代表泛型： 表示集合当中所有元素，全都是同一的类型
注意：泛型只能是引用类型，不能是基本类型    //因为集合里面保存的都是地址值，基本类型没有地址值
*/
public class CodeTest126ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //对于ArrayList集合来水，直接打印不是地址，而是内容
        System.out.println(list);

        //Arraylist的新增
        list.add("aa");
        System.out.println(list);

        list.add("bb");
        list.add("cc");
        System.out.println(list);


        /*
        * 常用方法:
        *  pubulce boolean add(E e): 像集合中添加元素，参数类型和泛型一致
        * public E get(int index):从集合当中获取元素，参数是索引编号
        * public E remove(int index):从集合当中删除元素，参数是索引编号
        * public int size(): 获取集合的尺寸长度，返回值是结合中包含的元素个数
        * */

        System.out.println("集合添加结果"+list.add("dd"));
        System.out.println("集合第一个元素是:"+list.get(0));
        System.out.println("集合长度是:"+list.size());
        String a = list.remove(0);
        System.out.println("删除了元素："+a);
        System.out.println("删除后==============");
        System.out.println("集合第一个元素是:"+list.get(0));
        System.out.println("集合长度是:"+list.size());

        //遍历
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        /*
        * ArrayList 对基本类型的处理
        * 涉及点：自动封箱  、 自动拆箱
        *
        * 如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”
        * 基本类型          包装类
        * byte              Int
        * short             Short
        * int               Integer
        * long              Long
        * float             Float
        * doublie           Double
        * char              Character
        * boolean           Boolean
        * */

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);  //该步骤会实现自动封装

        int cc = list2.get(0);      // 该步骤会实现自动拆箱
        System.out.println(cc);



    }
}
