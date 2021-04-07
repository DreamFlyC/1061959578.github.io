package cn.dsq2.test05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util  接口 Iterator<E>    :迭代器
    有两个常用的方法
        boolean	hasNext()：如果仍有元素可以迭代，则返回 true。
        E	next()：返回迭代的下一个元素。
     Iterator迭代器是一个借口，我们无法直接使用，需要使用Iterator接口实现类，获取方式比较特殊
     Collection接口中有一个方法，叫iterator（），这个方法返回的就是迭代器的实现类对象
         Iterator<E>	iterator()：返回在此 collection 的元素上进行迭代的迭代器。

     迭代器的使用步骤（重点）：
        1.使用集合中的方法iterator()回去迭代器的实现类对象，使用接口Iterator接口接受（多态）
        2.使用Iterator接口中的方法hasNext判断是否存在下一个元素
        3.使用Iterator接口中的next取出下一个元素
*/
public class Test242Iterator {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        //创建一个集合对象
        Collection <String> cc = new ArrayList<>();
        cc.add("apple");
        cc.add("balance");
        cc.add("orange");
        //使用集合中的方法iterator()回去迭代器的实现类对象，使用接口Iterator接口接受（多态）
        //注意：Iterator接口的泛型和集合的泛型一致
        Iterator<String> it = cc.iterator();


//        //2.使用Iterator接口中的方法hasNext判断是否存在下一个元素
//        System.out.println(it.hasNext());
//        //3.使用Iterator接口中的next取出下一个元素
//        System.out.println(it.next());
//        //2.使用Iterator接口中的方法hasNext判断是否存在下一个元素
//        System.out.println(it.hasNext());
//        //3.使用Iterator接口中的next取出下一个元素
//        System.out.println(it.next());

        //使用循环优化
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}




