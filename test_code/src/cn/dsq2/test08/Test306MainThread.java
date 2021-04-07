package cn.dsq2.test08;

/*
    主线程：执行(main）方法的程序

    单线程程序：java程序中只有一个线程
        执行从main方法开始从上到下一次执行

        java执行main方法，main方法会进入到栈内存
        JVM会找操作系统开辟一条mian方法通向cpu的执行路径
        而这个路径的名称，叫做mian(主)线程
*/
public class Test306MainThread {
    public static void main(String[] args) {
        Test306Person p1 = new Test306Person("一号");
        p1.run();
        //单线程弊端：加入中间出现异常，将不会执行二号对象的程序
        Test306Person p2 = new Test306Person("二号");
        p2.run();
        // 代码从上到下依次执行，先执行一号再执行二号
    }
}
