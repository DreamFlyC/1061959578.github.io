package cn.dsq2.test09;

/*
    模拟卖票案例:
        创建3个线程，对共享的票进行出售
*/
public class Test317Ticket {
    public static void main(String[] args) {
        //创建线程
        Test317RunnableImpl run = new Test317RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        //多线程开始卖票
        t1.start();
        t2.start();
        t3.start();
        //
    }
}
