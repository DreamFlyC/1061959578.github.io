package cn.dsq2.test09;

public class Test311SetThreadName {
    public static void main(String[] args) {
        Test311Thread t1 = new Test311Thread("构造方法设置的线程名称");

        //调用线程
        t1.start();
    }
}
