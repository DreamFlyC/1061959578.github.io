package cn.dsq2.test09;

/*
    创建多线程第二种方法的实现步骤：
        1.创建Runnable接口的实现类
        2.重现实现类的run方法
        3.创建一个Runnable接口的实现对象
        4.创建一个Thread类对象，传入Runnable借口哦实现类对象
        5.调用Thread类的start方法
*/

/*
    实现Runnable接口创建多线程程序的好处：
    1.避免了单继承的局限性(类是单继承，但是接口可以多实现)
    2.增强了程序的扩展性(降低了程序的耦合性-->解耦）
        实现Runnable接口的方式，把设置线程任务和开启新线程进行了分类(解耦)
        也就是说我们执行要执行多线程，而Runnable只负责写多线程的程序。 而不用在Thread类的run方法中关心需要实现什么多线程程序了
*/
public class Test313RunnableDemo {
    public static void main(String[] args) {
        Test313RunnableImpl r = new Test313RunnableImpl();
        Thread th = new Thread(r);
//        5.调用Thread类的start方法
        th.start();
//        主方法
        for (int i = 0; i < 20; i++) {
            System.out.println("主方法"+i);
        }

    }
}
