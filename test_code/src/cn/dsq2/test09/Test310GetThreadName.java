package cn.dsq2.test09;

/*
    线程名称：
        主线程:main
        新线程：Thread-0，Thread-1，...
*/
public class Test310GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        Test310MyThread mt = new Test310MyThread();

        //调用start方法，开启新线程
        mt.start(); //Thread-0
        new Test310MyThread().start(); //Thread-1
        new Test310MyThread().start(); //Thread-2

        //获取主线程名称
        System.out.println(Thread.currentThread().getName());   //main
        /*
        第二种方法
        Thread[Thread-1,5,main]
        Thread[Thread-0,5,main]
        Thread-0
        Thread[Thread-2,5,main]
        Thread-2
        Thread-1
        */
    }
}
