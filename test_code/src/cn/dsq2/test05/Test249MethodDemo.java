package cn.dsq2.test05;

/*
    测试含有泛型的方法
*/
public class Test249MethodDemo {
    public static void main(String[] args) {
        //创建GenericMethod对象
        Test249Method gm = new Test249Method();

        //调用含有泛型的方法,就不用纠结数据是字符类型还是数值类型了

        gm.method01(10);
        gm.method01("abcc");
    }
}
