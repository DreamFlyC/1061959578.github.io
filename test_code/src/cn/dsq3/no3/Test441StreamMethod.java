package cn.dsq3.no3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author: 段市庆
 * @date: 2021/6/2 23:12
 */


public class Test441StreamMethod {
    public static void main(String[] args) {

        /*
        Stream流中的常用方法_forEach
        void forEach（Consumer<? super T> action);
        Consumer接口是一个消费型的函数式接口，可以船底Lambda表达式
        */
        Stream<String> stream = Stream.of("a", "b", "Aa", "Bb");
        stream.forEach(name-> System.out.print(name));
        System.out.println("--------------------------");
        /*
         filter方法将一个流转换成另一个子集流
         Stream<T> filter(Predicate<? super T> predicate);
           该接口接收一个Predicate函数式接口参数作为筛选条件
        */

        Stream<String> stream2 = Stream.of("a", "b", "Aa", "Bb");
        stream2.filter(str->str.length()==2).forEach(name-> System.out.print(name));


        System.out.println("--------------------------");
        /*
        Stream流属于管道流，只能被（使用）一次，
        延迟方法 相当于 把原来Stream流变化后的数据调到新的Stream刘
        终结方法使用后，Stream流则不再可以使用
        */
        System.out.println("--------------------------");
        /*
        如果需要将流中的元素映射到另一个流中，可以使用map方法，
        <R> Stream<R> map<Function<? super T,? extends R> mapper);

        */
        Stream<String> stream3 = Stream.of("1", "2", "11", "22");
        stream3.map(s->Integer.parseInt(s)).forEach(s-> System.out.print(s));
        System.out.println("--------------------------");
        /*
            统计个数的方法，该方法返回一个Long值代表元素个数
            long count()
        */
        Stream<String> stream4 = Stream.of("1", "2", "11", "22");
        System.out.println(stream4.count());
        System.out.println("--------------------------");

        /*
            limt方法可以对流进行截取，只取用钱n个
            Stream<T> limt(long maxsize)
        */
        Stream<String> stream5 = Stream.of("1", "2", "11", "22");
        stream5.limit(2).forEach(name-> System.out.println(name));


        /*
            如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
            Stream<T> skip(long n)
        */
        System.out.println("--------------------------");
        Stream<String> stream6 = Stream.of("1", "2", "3", "4");
        Stream<String> streamSkip = stream6.skip(3);
        streamSkip.forEach(name-> System.out.println(name));

        /*
        如果有两个流，希望合并成为一个流，那么可以使用stream接口的  静态方法 concat
        static<T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
        */
        System.out.println("--------------------------");
        Stream<String> stream7 = Stream.of("1", "2", "3", "4");
        Stream<String> stream8 = Stream.of("a", "b", "c", "d");
        Stream<String> streamconcat = Stream.concat(stream7, stream8);
        streamconcat.forEach(name-> System.out.println(name));


    }

}
