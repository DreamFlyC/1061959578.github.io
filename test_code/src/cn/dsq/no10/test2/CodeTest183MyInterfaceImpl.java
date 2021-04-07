package cn.dsq.no10.test2;

public class CodeTest183MyInterfaceImpl extends CodeTest183MyInterfaceImplFu implements CodeTest183MyInterfaceA,CodeTest183MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A接口的A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B接口的B方法");
    }

    @Override
    public void method() {
        System.out.println("覆盖了AB接口重名的方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写冲突的默认方法");
    }
}
