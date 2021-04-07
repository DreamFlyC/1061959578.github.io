package cn.dsq2.test09;

/*
    设置线程的名称(了解）
        1.使用Thread类中的方法seName(名称)：
             void	setName(String name)：改变线程名称，使之与参数 name 相同。
        2.创建一个带参数的构造方法，继承父类的带参数的构造方法，给线程名称
            Thread(String name)：分配新的 Thread 对象。

*/
public class Test311Thread extends Thread{

    public Test311Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("线程方法设置的名称");
        System.out.println(t.getName());

    }
}
