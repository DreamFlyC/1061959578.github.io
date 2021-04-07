package cn.dsq2.test06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.list 接口 extends Collection接口
    list接口特点：
        1.有序集合，存储和取出的顺序一直
        2.带有索引,包含一些索引特有方法
        3.允许存储重复元素

       List接口中带索引的方法（特有）：
        void	add(int index, E element)：在列表的指定位置插入指定元素（可选操作）。
        E	get(int index)：返回列表中指定位置的元素
        E	remove(int index)：移除列表中指定位置的元素（可选操作）。
        E	set(int index, E element)：用指定元素替换列表中指定位置的元素（可选操作）。

*/
public class Test206List {
    public static void main(String[] args) {
        //创建一个list对象
        List<String> list = new ArrayList<>(); //多态

        list.add("a");
        list.add("b");
        list.add("a");
        System.out.println(list);
        //void	add(int index, E element)：在列表的指定位置插入指定元素（可选操作）。
        demo01(list);
        //E	get(int index)：返回列表中指定位置的元素
        demo02(list);
        //E	remove(int index)：移除列表中指定位置的元素（可选操作）。
        demo03(list);
        //E	set(int index, E element)：用指定元素替换列表中指定位置的元素（可选操作）。
        demo04(list);

        //list集合有3中遍历方法
        //普通fo循环
        System.out.println("===================");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //使用迭代器
        System.out.println("===================");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //for each ;
        System.out.println("===================");
        for (String s : list) {
            System.out.println(s);

        }

    }

    private static void demo04(List<String> list) {
        list.set(0,"hello");
        list.set(1,"world");
        System.out.println(list);
    }

    private static void demo03(List<String> list) {
        String sr =list.remove(2);
        String sr2 =list.remove(2);
        System.out.println(list);
        System.out.println(sr);
    }

    private static void demo02(List<String> list) {
        String sr = list.get(2);
        System.out.println(sr);
    }

    private static void demo01(List<String> list) {
        list.add(2,"hello,world"); //需要注意索引不能超出数组方法
        System.out.println(list);
    }
}

/*
F:\environment\java\jdk1.8.0_251\bin\java.exe "-javaagent:F:\code-tools\IDEA\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=50950:F:\code-tools\IDEA\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath F:\environment\java\jdk1.8.0_251\jre\lib\charsets.jar;F:\environment\java\jdk1.8.0_251\jre\lib\deploy.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\access-bridge-64.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\cldrdata.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\dnsns.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\jaccess.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\jfxrt.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\localedata.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\nashorn.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\sunec.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\sunjce_provider.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\sunmscapi.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\sunpkcs11.jar;F:\environment\java\jdk1.8.0_251\jre\lib\ext\zipfs.jar;F:\environment\java\jdk1.8.0_251\jre\lib\javaws.jar;F:\environment\java\jdk1.8.0_251\jre\lib\jce.jar;F:\environment\java\jdk1.8.0_251\jre\lib\jfr.jar;F:\environment\java\jdk1.8.0_251\jre\lib\jfxswt.jar;F:\environment\java\jdk1.8.0_251\jre\lib\jsse.jar;F:\environment\java\jdk1.8.0_251\jre\lib\management-agent.jar;F:\environment\java\jdk1.8.0_251\jre\lib\plugin.jar;F:\environment\java\jdk1.8.0_251\jre\lib\resources.jar;F:\environment\java\jdk1.8.0_251\jre\lib\rt.jar;F:\code-tools\code\java-code\JavaTest\out\production\test_code cn.dsq2.test06.Test206List
[a, b, a]
[a, b, hello,world, a]
hello,world
[a, b]
hello,world
[hello, world]
===================
hello
world
===================
hello
world
===================
hello
world

进程已结束,退出代码0

*/