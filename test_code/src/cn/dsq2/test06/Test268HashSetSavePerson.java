package cn.dsq2.test06;

import java.util.HashSet;

/*
    给HashSet中存放自定义类型的元素时，需要重写对象中的HashCode和Equals方法，简历自己的比较方式，才能保证HashSet集合中的对象唯一
*/
public class Test268HashSetSavePerson {
    public static void main(String[] args) {
        //当没有重写的时候
        HashSet<Test268Person> set = new HashSet<>();
        Test268Person p1 = new Test268Person("一号",12);
        Test268Person p2 = new Test268Person("二号",12);
        Test268Person p3 = new Test268Person("一号",12);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        // 当没有重写HashCode 和Equas方法的时候 ，运行结果位：[Test268Person{name='一号', age=12}, Test268Person{name='二号', age=12}, Test268Person{name='一号', age=12}]
        //重写后运行结果：[Test268Person{name='二号', age=12}, Test268Person{name='一号', age=12}]
    }
}
