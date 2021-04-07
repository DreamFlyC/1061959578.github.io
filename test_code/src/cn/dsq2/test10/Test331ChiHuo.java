package cn.dsq2.test10;

import sun.awt.windows.WPrinterJob;

public class Test331ChiHuo extends Thread{
    //定义包子遍历
    private Test331BaoZi bz;

    //使用构造方法为包子赋值
    public Test331ChiHuo(Test331BaoZi bz) {
        this.bz = bz;
    }


    //重写run方法

    @Override
    public void run() {

        while (true){
            synchronized (bz){
                //对包子状态进行判断
                if (bz.flag==false){
                    //进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //如果包子存在，则吃包子
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"包子");
                //吃饭后更爱包子状态，让包子铺继续生成包子
                bz.flag = false;
                bz.notify();
                System.out.println("吃货吃完了"+bz.pi+bz.xian+"包子，叫包子铺继续做包子");
                System.out.println("分割线-----------------------------------");
            }
        }
    }
}
