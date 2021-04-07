package cn.dsq.no10.test5;


/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁(右边) ，就优先用谁，没有则向上找
*/
public class Codetest188MultiMethod {
    public static void main(String[] args) {

        CodeTest187Fu obj = new CodeTest187Zi();

        obj.method(); //优先用子类方法
        obj.methodFu();
//        obj.methodZi();       //错误写法
    }
}
