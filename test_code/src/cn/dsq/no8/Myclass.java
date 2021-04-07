package cn.dsq.no8;

public class Myclass {
    public void method(){
        System.out.println("这是一个成员方法");
    }

    public static  void  methodStatic(){
        System.out.println("这是一个静态方法");
    }

    //静态代码块
    //特点：当第一次用到本类时，静态代码块执行唯一的一次
    static {
        System.out.println("静态代码块执行!");
    }

    public Myclass() {
        System.out.println("构造方法执行");
    }
}
