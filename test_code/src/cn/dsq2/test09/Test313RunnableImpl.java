package cn.dsq2.test09;

/*
    创建多线程的第二种方法：
        java.lang 接口 Runnable:
        1.创建一个实现Runnable接口类，并重写run方法
        2.通过java.lang.Thread类的构造方法，实现多线程
            Thread(Runnable target):分配新的 Thread 对象。
            Thread(Runnable target, String name):分配新的 Thread 对象。

*/
public class Test313RunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("多线程方法"+i);
        }
    }
}
