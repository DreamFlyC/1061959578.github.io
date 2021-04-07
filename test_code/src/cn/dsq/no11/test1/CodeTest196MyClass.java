package cn.dsq.no11.test1;

/*
当final 关键字用来修饰一个类的时候，格式
public final class 类名称{
    //方法体
}
含义：当前这个类不能有任何子类。（太监类） 一定有父类(至少是object）
不能有子类后，再把父类加上final关键字
*/
public class CodeTest196MyClass {

    public  void method(){
        System.out.println("方法执行");
    }
}
