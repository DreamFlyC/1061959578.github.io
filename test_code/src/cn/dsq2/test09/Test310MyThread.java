package cn.dsq2.test09;

/*
    获取线程的名称：
        1.使用Thread类中的getName()方法：
            String	getName()：返回该线程的名称。
        2.获取当前正在执行的线程后再使用getName()方法
            static Thread	currentThread()：返回对当前正在执行的线程对象的引用。
*/

//定义一个Thread类的子类
public class Test310MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务


//    @Override
//    public void run() {
//        //获取线程名称第一种方法
//        String name = getName();
//        System.out.println(name);
//    }

    @Override
    public void run() {
        //获取线程名称第二种方法
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
    }

}
