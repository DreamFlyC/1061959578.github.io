package cn.dsq2.test05;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型通配符： ？： 标识任意的数据类型
    使用方式：
        不能创建对象使用，只能作为方法的参数使用
*/
public class Test251GenericWildCards {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        //作为方法的参数使用 ,这样list无论为数组还是字符都可以通过demo01方法输出
        demo01(list1);
        demo01(list2);
        //不建议创建对象使用，
//        ArrayList<?> list3 = new ArrayList<>();

    }

    private static void demo01(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


}
