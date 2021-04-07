package cn.dsq.no10.test1;

public class CodeTest175MyInterfaceDefaultB implements CodeTest175MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法,bbb");
    }

    @Override
    public void methodDefault() {
        System.out.println("B覆盖默认方法");
    }
}
