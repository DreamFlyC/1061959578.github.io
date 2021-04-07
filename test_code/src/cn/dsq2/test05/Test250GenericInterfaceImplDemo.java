package cn.dsq2.test05;


public class Test250GenericInterfaceImplDemo {
    public static void main(String[] args) {
        //创建实现接口的对象
        Test250GenericInterfaceImpl tgi = new Test250GenericInterfaceImpl();
        tgi.method1("abc");

        //
        Test250GenericInterfaceImpl2 tgi2 = new Test250GenericInterfaceImpl2();
        tgi2.method1("abc");

        //
        Test250GenericInterfaceImpl2<Integer> tgi3 = new Test250GenericInterfaceImpl2<>();
        tgi3.method1(123);

    }

}
