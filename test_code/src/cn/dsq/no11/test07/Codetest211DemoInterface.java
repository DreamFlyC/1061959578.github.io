package cn.dsq.no11.test07;

import java.util.ArrayList;
import java.util.List;


/*
import java.util.List 是 ArrayList实现的接口

*/
public class Codetest211DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
//        List<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();        //因为Java作为一个面向对象的语言遵循了“里氏替换原则”，即一个对象可以赋值给它所继承的类或所实现的接口的变量。

        List<String> result = addnames(list2);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    //方法  List<String> list 传入的是List<String> list = new ArrayList<>(); 多态：已经实现了方法
    public static List<String>  addnames(List<String> list){
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        return list;
    }
}
