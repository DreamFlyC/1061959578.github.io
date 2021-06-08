package cn.dsq3.no3;

import java.util.ArrayList;

public class Test438Stream {
    public static void main(String[] args) {
        //创建一个list集合，存储姓名
        ArrayList<String> lst = new ArrayList<>();
        lst.add("张三丰");
        lst.add("张三");
        lst.add("李四");
        lst.add("周芷若");
        lst.add("张无忌");

        //使用集合中Stream流的filter方法,filter方法中有函数式接口 Predicate
        lst.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));

    }
}
