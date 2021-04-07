package cn.dsq2.test10;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池：JDK1.5之后提供的
    java.util.concurrent 类 Executors：线程池的工厂类，用来生产线程池
       方法：
           static ExecutorService	newFixedThreadPool(int nThreads)：创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。
                Tip:返回值ExecutorService 是一个接口类型，返回该接口的实现类对象。 可以使用接口接收

     java.util.concurrent 接口 ExecutorService：线程池接口
        方法：
             Future<?>	submit(Runnable task)：提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
               用来从线程池中获取线程，调用Start方法，执行线程任务

      线程池使用步骤：
        1.使用线程池的工厂类 Executors里面提供的静态方法 newFixedThreadPool，生成一个指定线程数量的线程池
        2.创建一个类，实现Runnable接口，重写run方法，设置线程任务。
        3.调用ExecutorService中的方法submit,传递线程任务并执行
        4.调用ExecutorService中的方法shutdown，销毁线程池

*/
public class Test334ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池的工厂类 Executors里面提供的静态方法 newFixedThreadPool，生成一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //2.创建一个类，实现Runnable接口，重写run方法，设置线程任务。
        Runnable rt = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
            }
        };

        //3.调用ExecutorService中的方法submit,传递线程任务并执行
        es.submit(rt);  //pool-1-thread-1创建了一个新的线程执行
        es.submit(rt);  //pool-1-thread-3创建了一个新的线程执行
        es.submit(rt);  //pool-1-thread-2创建了一个新的线程执行

        //4.调用ExecutorService中的方法shutdown，销毁线程池（不建议执行)
        es.shutdown();

    }
    
}











