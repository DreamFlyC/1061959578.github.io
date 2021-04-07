package cn.dsq.no10.test3;

public interface CodeTest184MyInterfaceB {

    public abstract void methodB();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("B接口的默认方法");
    }

    public static void methodStatic(){
        System.out.println("B接口的静态冲突方法");
    }
}
