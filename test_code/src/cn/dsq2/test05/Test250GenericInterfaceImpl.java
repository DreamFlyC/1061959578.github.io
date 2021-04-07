package cn.dsq2.test05;

/*
    含有泛型接口的使用方式：
        第一种：定义接口的实现类，实现接口，指定接口的泛型
        第二种：接口使用说明泛型，实现类就使用说明泛型
*/
public class Test250GenericInterfaceImpl implements Test250GenericInterface<String>{
//    指定接口泛型的数据类型后，方法数据类型就直接为String。
    @Override
    public void method1(String s) {
        System.out.println(s);
    }
}
