package cn.dsq.no6;

/*
定义一个类，用来模拟学生事务，分为属性和行为两个部分

属性（是什么）：
姓名
年龄
行为(干什么)：
    睡觉
    吃饭
    学习
对应java的类当中
成员变量(属性):
    String name ;//姓名
    int age;    //年龄
成员方法(行为):
    public void eat()//吃饭
    public void sleep()     //睡觉
    public vode study()     //学习
*/

public class Student {
    String name ;//姓名     -->  成员变量  （建议初始化)
    int age;      //年龄

    //成员方法
    public void eat(){      //成员方法不需要static,有static修饰的可以叫类方法、类变量。可以被类调用
        System.out.println("吃饭");
    }
}
