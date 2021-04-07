package cn.dsq2.test05;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的上限限定和下限限定：(了解即可）
        上限限定： ? extends 类名称 ：代表使用的泛型的只能是该类及其子类
        下限限定： ? super 类名称：代表使用的泛型的只能是该类及其父类
*/
public class Test251GenericList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //上限限定： ? extends 类名称 ：代表使用的泛型的只能是该类及其子类
        demo01(list1);
        //下限限定： ? super 类名称：代表使用的泛型的只能是该类及其父类
        demo02(list1);
    }
    // Arralist 集合只能传递Interger类的父类或其自身
    private static void demo02(ArrayList<? super Integer> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Arralist 集合只能传递Number类的子类或其自身
    private static void demo01(ArrayList<? extends Number> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
