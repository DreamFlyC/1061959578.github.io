package cn.dsq.no10.test1;


/*
* 注意：不能通过接口实现类的对象来调用接口当中的静态方法
* 正确用法:通过接口名称,直接调用其中的青苔方法
* 格式:
* 接口名称.静态方法(参数)
* */
public class Codetest178Interface {
    public static void main(String[] args) {
        CodeTest178MyinterfaceImplStatic impl = new CodeTest178MyinterfaceImplStatic();

        //错误写法
//        impl.methodStatic();

        CodeTest178MyInterfaceStatic.methodStatic();

    }
}
