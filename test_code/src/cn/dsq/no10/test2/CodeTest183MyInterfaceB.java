package cn.dsq.no10.test2;

public interface CodeTest183MyInterfaceB {

    public  abstract void methodB();

    public abstract void method();

    public  default void methodDefault(){
        System.out.println("冲突的默认方法B");
    }

}
