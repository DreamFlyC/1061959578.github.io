package cn.dsq.no10.test3;

public interface CodeTest184MyInterfaceA {

    public abstract void methodA();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("A接口的默认方法");
    }

    public static void methodStatic(){
        System.out.println("A接口的静态冲突方法");
    }
}
