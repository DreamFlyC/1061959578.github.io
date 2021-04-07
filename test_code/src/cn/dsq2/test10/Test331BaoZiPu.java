package cn.dsq2.test10;


/*
    注意：包子铺线程和包子线程关系-->通信（互斥）
        可以用包子作为锁对象，解决线程安全问题
*/
public class Test331BaoZiPu extends Thread {

    //定义包子遍历
    private Test331BaoZi bz;

    //使用构造方法为包子赋值
    public Test331BaoZiPu(Test331BaoZi bz) {
        this.bz = bz;
    }


    //重写run方法
    @Override
    public void run() {
        int count = 0;
        while (true) {
            //同步技术，保证线程安全
            synchronized (bz) {
                //判断包子状态
                if (bz.flag == true) {
                    //如果包子存在则叫顾客来吃
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果包子不存在，则制作包子
                if (count % 2 == 0) {//count用来生成不同包子的判断
                    bz.pi = "薄皮";
                    bz.xian = "粉丝";
                } else {
                    bz.pi = "厚皮";
                    bz.xian = "猪肉";
                }
                count++;
                //包子铺制作包子
                System.out.println("包子铺正在制作：" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //生成好包子后更改包子状态，唤醒吃货线程
                bz.flag = true;
                bz.notify();
                System.out.println("叫顾客来吃包子");
            }
        }
    }

}
