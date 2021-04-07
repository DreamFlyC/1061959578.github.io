package cn.dsq2.test08;

public class TestThreadExceptionDemo {
    public static void main(String[] args) {

        //线程A执行
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程A执行");
            }
        }).start();

        //线程B执行
        new Thread(new Runnable() {
            @Override
            public void run() {
                //出现运行异常
                int i =1/0;
                System.out.println("线程B执行");
            }
        }).start();

        //线程C执行
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //出现运行异常
                    int i =1/0;
                    System.out.println("线程C执行");
                }
            }).start();
        }catch (Exception e){
            System.out.println("捕获了子线程异常");
        }


        //主线程程序
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程执行");
    }
}

/*
    子线程异常不会影响主线程执行
    主线程无法用try...catch捕获异常并处理，还是会交个JVM处理
*/