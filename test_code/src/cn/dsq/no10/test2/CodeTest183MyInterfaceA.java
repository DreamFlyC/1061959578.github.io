package cn.dsq.no10.test2;

import org.omg.CORBA.PUBLIC_MEMBER;

public interface CodeTest183MyInterfaceA {

    public  abstract void methodA();

    public abstract void method();

    public  default void methodDefault(){
        System.out.println("冲突的默认方法A");
    }

    public abstract void methodFu();

    public default void methodFuDefault(){
        System.out.println("与父类冲突的接口默认方法");
    }
}
