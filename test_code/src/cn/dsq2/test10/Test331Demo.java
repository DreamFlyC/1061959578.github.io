package cn.dsq2.test10;

public class Test331Demo {
    public static void main(String[] args) {
        //创建包子对象
        Test331BaoZi bz = new Test331BaoZi();
        //创建线程
        new Test331BaoZiPu(bz).start();
        new Test331ChiHuo(bz).start();
    }
}
