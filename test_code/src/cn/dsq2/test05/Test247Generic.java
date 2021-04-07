package cn.dsq2.test05;

import java.util.ArrayList;
import java.util.Iterator;

public class Test247Generic {
    public static void main(String[] args) {
        demo01();   //创建集合对象，不使用泛型：
        demo02();   //创建对象，使用泛型
    }

    private static void demo02() {
        /*
            创建对象，使用泛型
            好处：
                1.避免了类型转换的麻烦
                2.把运行期异常提升到了编译期
            弊端：
                泛型是什么类型，就只能是什么能行数据
        */
        ArrayList<String> list = new ArrayList<>();
//        list.add(1);  会报错
        list.add("1");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);

            //由于Obj是Object类，不能使用子类特有的方法。所以需要向下转型后使用子类特有的方法
            System.out.println(s.length()); //由于存在1， 所以会抛出类型转换异常ClassCastException
        }
    }

    private static void demo01() {
        /*
            创建集合对象，不使用泛型：
                好处：集合不适用泛型，默认的类型就是Object,可以存储任意类型数据
                弊端：不安全，会引发异常
        */
        ArrayList list = new ArrayList();   //没有定义泛型，默认为Object
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //由于Obj是Object类，不能使用子类特有的方法。所以需要向下转型后使用子类特有的方法
            String s = (String) obj;
            System.out.println(s.length()); //由于存在1， 所以会抛出类型转换异常ClassCastException
        }

    }
}
