package cn.dsq2.test1;

import cn.dsq.no7.Person;

public class Test215DemoToString {
    public static void main(String[] args) {
        Test215Person person = new Test215Person("张三",18);
        //person类默认集成了object类，所以可以直接使用Object的toSting方法

        String s = person.toString();
        System.out.println(s);      //cn.dsq2.test1.Test215Person@1b6d3586
            //复写toString后 ：Test215Person{name='张三', age=18}

        //直接打印对象的名字，就是调用对象的toString方法
        //看一个类是否重写toSting方法，直接打印对象即可
        System.out.println(s);



    }
}
