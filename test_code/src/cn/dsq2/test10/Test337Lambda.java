package cn.dsq2.test10;

public class Test337Lambda {
    public static void main(String[] args) {
        //lambda表达式写法
        //()->{} 把参数传递给{}方法
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行");
        }).start();
    }
}
