package cn.dsq2.test05;

/*
    定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间
    格式：
        修饰符<泛型> 返回值类型 方法名(参数列表(可以使用泛型){
            方法体
        }
*/
public class Test249Method {
    //定义一个泛型
    public<M>  void method01(M m){
        System.out.println(m);
    }
}
