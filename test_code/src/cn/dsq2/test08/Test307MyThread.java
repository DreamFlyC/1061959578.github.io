package cn.dsq2.test08;
//1.创建Thread类的子类


public class Test307MyThread extends Thread{

    // 2.重写子类中run方法
    @Override
    public void run() {
        for (int i = 0; i < 21; i++) {
            System.out.println("run"+i);
        }
    }

}
