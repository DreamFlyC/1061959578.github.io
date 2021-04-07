package cn.dsq2.test09;

/*
    匿名内部类实现线程的创建
*/
public class Test315InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            //重写run方法设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();

        //线程的接口
        Runnable r = new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"二号");
                }
            }
        };
        new Thread(r).start();

        //简化接口的方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"三号");
                }
            }
        }).start();
    }
}
