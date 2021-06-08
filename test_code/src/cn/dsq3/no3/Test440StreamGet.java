package cn.dsq3.no3;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T> 是java 8 新加入的最常用的流接口
    通常有2中获取方式：
        1.所有Collection集合都可以通过stream默认方法获取
        2.Stream接口中的静态方法of可以获取数组对应的流
*/
public class Test440StreamGet {
    public static void main(String[] args) {
        //集合中的stream方法
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //通过Stream的静态方法Of（T...values）
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    }
}
