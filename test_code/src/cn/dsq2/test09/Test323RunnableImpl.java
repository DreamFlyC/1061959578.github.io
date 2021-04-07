package cn.dsq2.test09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
     解决线程安全问题的第三种方法：使用锁机制(Lock锁）
     java.util.concurrent.locks 接口 Lock
     方法：
        void	lock()：获取锁。
        void	unlock()：释放锁。

     使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        继承者 java.util.concurrent.locks.ReentrantLock
        2.在可能会出现安全问题的代码前调用方法lock() 获取锁
        3.在可能会出现安全问题的代码后调用方法unlock() 释放锁
*/
public class Test323RunnableImpl implements Runnable{
    //定义一个多线程共享的票
//    private int ticket =100;
    private static int ticket =100;

    //1.在成员位置创建一个ReentrantLock对象
    ReentrantLock l1 = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run() {

        //使用死循环，让卖票操作重复执行
        while (true){
            //2.在可能会出现安全问题的代码前调用方法lock() 获取锁
            l1.lock();

            //判断票是否存在
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"出售了第"+ticket+"张票");
                ticket =ticket-1;
            }

            //3.在可能会出现安全问题的代码后调用方法unlock() 释放锁
            l1.unlock();
        }
    }

}
