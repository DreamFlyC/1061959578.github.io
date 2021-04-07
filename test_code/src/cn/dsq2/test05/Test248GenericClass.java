package cn.dsq2.test05;


/*
    定义一个含有泛型的类，模拟ArrayList集合
    应对不知道处理的数据为什么类型的时候
*/
public class Test248GenericClass {
    private String name;

    public Test248GenericClass() {
    }

    public Test248GenericClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
