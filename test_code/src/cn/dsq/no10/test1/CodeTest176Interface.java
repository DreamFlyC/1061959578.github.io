package cn.dsq.no10.test1;


/*
* 1.接口的默认方法，可以通过接口的实现类对象，直接调用
* 2.接口的默认方法，也可以被接口实现类进行覆盖重写
* */
public class CodeTest176Interface {
    public static void main(String[] args) {
        CodeTest175MyInterfaceDefaultA a = new CodeTest175MyInterfaceDefaultA();
        a.methodAbs(); //调用抽象方法，实际运行的是右侧的实现类

        //调用接口的默认方法
        a.methodDefault();

        CodeTest175MyInterfaceDefaultB b = new CodeTest175MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}

//运行结果:
//        实现了抽象方法,aaa
//        这是新添加默认方法
//        实现了抽象方法,bbb
//        B覆盖默认方法