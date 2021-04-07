package cn.dsq2.test08;

/*
    创建多线程程序的第一种方式： 创建Thread的子类
    javalang.Thread类：是描述线程的类

    实现步骤：
        1.创建Thread类的子类
        2.重写子类中run方法
        3.创建子类对象
        4.调用start方法,开启新线程
         void	start():使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
            结果是两个线程并发地运行；当前线程-->mian（从调用返回给 start 方法）和另一个线程-->新线程（执行其 run 方法）。
            多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
*/
public class Test307Thread {
    public static void main(String[] args) {
//        3.创建子类对象
        Test307MyThread mt = new Test307MyThread();
//        4.调用start方法,开启新线程
        mt.start();

        //主线程程序
        for (int i = 0; i < 21; i++) {
            System.out.println("mian"+i);
        }

        //输出结果会根据cpu执行而不同，不再是从上到下一次执行

    }
}
