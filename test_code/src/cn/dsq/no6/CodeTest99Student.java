package cn.dsq.no6;

/*
* 类是不同直接使用的，我们通常需要经过3个步骤
* 1.导包：指除使用的类再那个位置： import 包名称.类名称   //import cn.dsdq.no6.Student;
*       对于和当前类属于同一个包的情况，可以省略导包语句
* 2.创建
*       Student a = new Student();
* 3.使用
*   使用成员变量：对象名称.成员变量名
*   使用成员方法:对象名称.成员方法名()
* */

public class CodeTest99Student {
    public static void main(String[] args) {
        Student a  = new Student();     //实例化对象
        a.age =18;
//        a.name = "小睿睿";
        System.out.println(a.age);
        System.out.println(a.name);     //成员变量默认值 为Null
        a.eat();                        //成员方法


    }

}
