package cn.dsq2.test09;

/*
    实现卖票机制
*/
public class Test317RunnableImpl implements Runnable{
    //定义一个多线程共享的票
    private int ticket =100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true){
            //判断票是否存在
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"出售了第"+ticket+"张票");
                ticket =ticket-1;
            }
        }


    }
}
