package cn.dsq.no10.test5;

public class CodeTest187Zi extends CodeTest187Fu{
    //成员变量不能进行覆盖重写
    int num =20;

    int age =24;

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        System.out.println("子类特有方法");
    }

}
