package cn.dsq3.no3;

/**
 * @author: 段市庆
 * @date: 2021/6/9 14:37
 */
public class Test451Printa extends Test452PrintMethod{
    //定义一个方法,
    public static void printString(Test451Printable t){
        t.pcc("hello world");
    }


    public static void aPson(String s ,Test456Pson t){
        Test456Class aps = t.aps(s);
        System.out.println(aps);
    }

    //通过super调用父类的成员方法
    @Override
    public void printSrting(String s) {
        System.out.println("sss");
    }

    public void show(){
        printString(super::printSrting);
    }

    public void shouw2(){printString(this::printSrting);}



    public static void printstatic(String t){
        System.out.println(t.toLowerCase());
    }


    public static void main(String[] args) {
        printString(name-> System.out.println(name));
        //对象和方法都已经存在， 可以使用该方法引用优化lambda表达式
        printString(System.out::println);

        //通过对项名引用成员方法
        Test452PrintMethod pMethod = new Test452PrintMethod();
        printString(pMethod::printSrting);
//        printString(new Test452PrintMethod()::printSrting);

        //通过类名称引用静态方法
        printString(Test451Printa::printstatic);

        //通过super引用父类成员方法
        new Test451Printa().show();

        //通过this引用成功方法
        new Test451Printa().shouw2();

        //类的构造器引用
        aPson("小张",Test456Class::new);


        //数组的构造器引用





    }
}
