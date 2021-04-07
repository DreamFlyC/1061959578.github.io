package cn.dsq2.test09;

/*
    熟悉Object类的wait 和 Notify方法
*/
public class Test327WaitAndNotify {
    public static void main(String[] args) {

        //创建一个锁对象
        Object obj = new Object();

//        创建一个包子铺线程
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //需要判定线程安全的代码
                synchronized (obj) {
                    System.out.println("老板正在做包子");
                    //唤醒对象监视器上等待的单个线程,唤醒全部线程可以用notionally()
                    System.out.println("老板做好了包子，叫顾客来吃");
                    obj.notify();
                }
            }
        }).start();

        //创建顾客线程
        new Thread(() -> {
            //需要判断安全的代码
            synchronized (obj) {
                while (true) {
                    System.out.println("顾客叫老板做包子");
                    //是顾客先进入等待状态,让店铺线程先执行
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客吃完了包子");
                    System.out.println("--------------------------------------");

                }

            }
        }).start();

    }
}
