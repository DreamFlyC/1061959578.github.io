package cn.dsq2.test4;

/*
    包装类： 装箱、拆箱
    Integer：
        构造方法：
            Integer(int value)：构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s)：构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
        静态方法：
            static Integer	valueOf(int i)：返回一个表示指定的 int 值的 Integer 实例。
            static Integer	valueOf(String s)：返回保存指定的 String 的值的 Integer 对象。
        拆箱
        成员方法：
            int	intValue()：以 int 类型返回该 Integer 的值。
*/
public class Test234Integer {
    public static void main(String[] args) {
        //Integer(int value)：构造一个新分配的 Integer 对象，它表示指定的 int 值。
        // Integer(String s)：构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
        demo01();
        //静态方法：
        // static Integer	valueOf(int i)：返回一个表示指定的 int 值的 Integer 实例。
        // static Integer	valueOf(String s)：返回保存指定的 String 的值的 Integer 对象。
        demo02();
        // 拆箱 ,int	intValue()：以 int 类型返回该 Integer 的值。
        demo03();

    }

    private static void demo03() {
        System.out.println("demo03======================");
        Integer in1 = new Integer(5);
        int i = in1.intValue();
        System.out.println(i);
    }

    private static void demo02() {
        System.out.println("demo02======================");
        Integer in1 = Integer.valueOf(4);
        Integer in2 = Integer.valueOf("4");
        System.out.println(in1);
        System.out.println(in2);
    }

    private static void demo01() {
        Integer in1 = new Integer(1);
        System.out.println(in1);
        Integer in2 = new Integer("2"); //这里的字符串只能是基本类型，String不是基本类型
        System.out.println(in2);
    }
}
