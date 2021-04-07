package cn.dsq2.test09;

/*
     解决线程安全问题的第二种方法：使用同步方法
    格式:
        修饰符 synchronized 返回值类型 方法名(参数列表){
            可能出现线程安全问题的代码
        }
     使用步骤：
        1.把访问共享数据的代码抽取出来放到一个方法中
        2.对方法使用synchronized修饰
*/
public class Test321RunnableImpl implements Runnable{
    //定义一个多线程共享的票
//    private int ticket =100;
    private static int ticket =100;

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true){
                saleTicket();
            }
        }

    //同步方法的锁对象就是 实现对象
    public synchronized void saleTicket(){
        //判断票是否存在
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"出售了第"+ticket+"张票");
            ticket =ticket-1;
        }
    }

    //静态同步方法,静态同步方法的锁对象是本类的class属性(本类的class对象)
    public static synchronized void saleStatickTicket(){
        //判断票是否存在
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"出售了第"+ticket+"张票");
            ticket =ticket-1;
        }
    }
}
