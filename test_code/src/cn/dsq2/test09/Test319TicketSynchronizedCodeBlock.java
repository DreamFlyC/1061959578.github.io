package cn.dsq2.test09;

/*
    模拟卖票案例:
        创建3个线程，对共享的票进行出售
*/
public class Test319TicketSynchronizedCodeBlock {
    public static void main(String[] args) {
        //创建线程
        Test319RunnableImpl run = new Test319RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        //多线程开始卖票
        t1.start();
        t2.start();
        t3.start();
        //由于同步代码块没有在出现安全问题了
    }
}
