package cn.dsq2.test06;

/*
    java.tuil.Collections是集合工具类，用来对集合进行操作，部分方法如下：
    static  <T> boolean addAll(Collection<? super T> c, T... elements)：将所有指定元素添加到指定 collection 中。
    static void	shuffle(List<?> list)：使用默认随机源对指定列表进行置换。
    static <T extends Comparable<? super T>> void sort(List<T> list)：根据元素的自然顺序 对指定列表按升序进行排序。
    static <T> void sort(List<T> list, Comparator<? super T> c)：根据指定比较器产生的顺序对指定列表进行排序。
*/

import cn.dsq.no7.Person;

import java.util.*;

public class Tested71Collections {
    public static void main(String[] args) {
        Collection<String> cc = new ArrayList<>();
        cc.add("a");
        cc.add("b");
        cc.add("c");

        //static  <T> boolean addAll(Collection<? super T> c, T... elements)：将所有指定元素添加到指定 collection 中。
        demo01(cc);
        //static void	shuffle(List<?> list)：使用默认随机源对指定列表进行置换。
        Collections.shuffle((List<?>) cc);
        System.out.println(cc);

        //static <T extends Comparable<? super T>> void sort(List<T> list)：根据元素的自然顺序 对指定列表按升序进行排序。
        demo03();
        //使用sort对自定义类进行排序，需要对自定义类重写Comparable方法
        /*
            重写方法的排序规则：
                this - 参数 就是升序
                参数 - this 就是降序
        */
        demo04();
        //static <T> void sort(List<T> list, Comparator<? super T> c)：根据指定比较器产生的顺序对指定列表进行排序。
        /*
            Comparator:相当于找一个第三方裁判，比较两个人
        */
        demo05();
    }

    private static void demo05() {
        ArrayList<Test268Person> arr = new ArrayList<>();
        Test268Person per1 = new Test268Person("一号",12);
        Test268Person per2 = new Test268Person("二号",10);
        Test268Person per3 = new Test268Person("三号",18);
        arr.add(per1);
        arr.add(per2);
        arr.add(per3);

        Collections.sort(arr, new Comparator<Test268Person>() {
            @Override
            public int compare(Test268Person o1, Test268Person o2) {
                return o2.getAge()-o1.getAge(); //降序
            }
        });
        System.out.println(arr);

    }

    private static void demo04() {

        ArrayList<Test268Person> arr = new ArrayList<>();
        Test268Person per1 = new Test268Person("一号",12);
        Test268Person per2 = new Test268Person("二号",10);
        Test268Person per3 = new Test268Person("三号",18);
        arr.add(per1);
        arr.add(per2);
        arr.add(per3);
        Collections.sort(arr);
        System.out.println(arr);

    }

    private static void demo03() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }

    private static void demo01(Collection<String> cc) {
        Collections.addAll(cc,"d","e","abcde");
        System.out.println(cc);

    }
}
/*
[a, b, c, d, e, abcde]
[d, e, abcde, c, a, b]
*/