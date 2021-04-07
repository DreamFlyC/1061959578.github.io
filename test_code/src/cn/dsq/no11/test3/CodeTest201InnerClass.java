package cn.dsq.no11.test3;


/*
如果一个事务的内部包含另一个事务，那么这就是一个类内部包含另一个类。
例如:身体和心脏的关系

分类：
1.成员内部类
2.局部内部类

成员内部类的定义格式
修饰符 class 外部类名称{
    修饰符 class 内部类名称{
        //...
    }
    //....
}

注意：
内部类使用外部，可以随意访问
外部类访问内部类，一定需要借助内部类对象
========================
如何使用成员内部类
1.间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法
2.直接方式：公式：
外部类名称。内部类名称 对象名= new 外部内名称（）.new  内部类名称();
*/
public class CodeTest201InnerClass {
    public static void main(String[] args) {
        CodeTest202Bady body = new CodeTest202Bady();
        //通过外部类的的对象，调用外部类的方法，间接使用内部类
        body.method();

        System.out.println("===============直接new内部类");

        CodeTest202Bady.Heart heat = new CodeTest202Bady().new Heart();
        
        heat.beat();
    }
}










