package cn.dsq3.no3;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author: 段市庆
 * @date: 2021/6/7 22:30
 * @description Stram流练习题1
 */
public class Test449StreamPractice {
    public static void main(String[] args) {
        /*
        传统方式
            现在又两个ArrayList结合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）一次进行一下若干操作步骤：
                1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
                2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
                3.第二个队伍只要姓张的成员姓名；存储到一个新集合中。
                4.第二个队伍筛选之后不要前2个人；存储到一个新集合中。
                5.将两个队伍合并为一个队伍；存储到一个新集合中
                6.根据姓名创建Person对象；存储到一个新集合中
                7.打印整个队伍的Person对象信息
        */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("迪丽热巴");
        list1.add("宋远桥");
        list1.add("苏星河");
        list1.add("石破天");
        list1.add("石中玉");
        list1.add("老子");
        list1.add("庄子");
        list1.add("洪七公");
        //队伍1处理
        ArrayList<String> listc1 = new ArrayList<>();
        for (String s : list1) {
            if(s.length() == 3){
                listc1.add(s);
            }
        }
        ArrayList<String> listc2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listc2.add(listc1.get(i));

        }



        ArrayList<String> list2 = new ArrayList<>();
        list2.add("古力娜扎");
        list2.add("张无忌");
        list2.add("赵丽颖");
        list2.add("张三丰");
        list2.add("尼古拉斯凯奇");
        list2.add("张天爱");
        list2.add("张二狗");


        //队伍2处理
        ArrayList<String> listd1 = new ArrayList<>();
        for (String s : list2) {
            if(s.startsWith("张")){
                listd1.add(s);
            }
        }
        ArrayList<String> listd2 = new ArrayList<>();
        for (int i = 2; i < listd1.size(); i++) {
            listd2.add(listd1.get(i));
        }


        //合并两个集合，兵处理
        ArrayList<String> list = new ArrayList<>();
        list.addAll(listd2);
        list.addAll(listc2);


        ArrayList<Test449Person> personlist = new ArrayList<>();
        for (String s : list) {
            personlist.add(new Test449Person(s));
        }

        for (Test449Person test449Person : personlist) {
            System.out.println(test449Person);
        }

        /*
        Stream流的方式
        */
//        Stream<String> st1 = list1.stream();
//        Stream<String> st1c = st1.filter(name -> name.length() == 3).limit(3);
//        Stream<String> st2 = list2.stream();
//        Stream<String> st2c = st2.filter(name -> name.startsWith("张")).skip(2);
//        Stream<String> all = Stream.concat(st1c, st2c);
//        all.forEach(s-> System.out.println("stram流输出:"+new Test449Person(s)));

        //优化
        Stream<String> st1 = list1.stream().filter(name -> name.length() == 3).limit(3);
        Stream<String> st2 = list2.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(st1,st2).map(s->new Test449Person(s)).forEach(name-> System.out.println("stram流输出:"+name));


    }
}
