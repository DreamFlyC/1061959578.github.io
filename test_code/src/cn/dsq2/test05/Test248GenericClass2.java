package cn.dsq2.test05;


/*
    定义一个含有泛型的类，模拟ArrayList集合
    应对不知道处理的数据为什么类型的时候
*/
public class Test248GenericClass2 <E>{
    private E name;

    public Test248GenericClass2() {
    }

    public Test248GenericClass2(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
