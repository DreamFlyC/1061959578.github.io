package cn.dsq2.test09;

/*
    解决线程安全问题的第一种方法：使用同步代码块
    格式:
        synchronized(锁对象){
            可能出现线程安全问题的代码
        }
     注意事项：
        1.同步代码块的锁对象，可以是任意对象
        2.必须保证多个线程使用的锁对象是同一个
        3.锁对象的总有：只让一个线程在同步代码块中执行
*/
public class Test319RunnableImpl implements Runnable{
    //定义一个多线程共享的票
    private int ticket =100;

    //创建一个锁对象
    Object obj= new Object();
    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true){
            //创建同步代码块
            synchronized (obj){
                //判断票是否存在
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"出售了第"+ticket+"张票");
                    ticket =ticket-1;
                }
            }

        }


    }
}
