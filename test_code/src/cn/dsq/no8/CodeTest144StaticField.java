package cn.dsq.no8;

public class CodeTest144StaticField {
    public static void main(String[] args) {
        //static 修饰成员变量
        Student one = new Student("郭靖",20);
        one.room = "101教室";
        System.out.println("姓名:"+one.getName()+",年龄:"+one.getAge()+",教室:"+one.getRoom()+",学号是："+one.getId());

        //没有堆two的room进行赋值,因为room 是static类型
        Student two = new Student("黄蓉",16);
        System.out.println("姓名:"+two.getName()+",年龄:"+two.getAge()+",教室:"+two.getRoom()+",学号是："+two.getId());

        //static修饰方法
        System.out.println("===============staitc修饰方法");
        /*
        * 一旦使用static修饰成员方法，那么这就成为了静态方法；静态方法不属于对象，而是属于类的
        * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它*/

        //静态代码块
        /*
        特点：当第一次用到本类时，静态代码块执行唯一的一次
        静态内容总是优先与非静态，所以静态代码块比构造方法先执行

        静态代码块的典型用途；用来一次性地对静态成员变量进行赋值

        可以通过类，和对象调用静态方法
        */
        // 注意区分静态方法和静态代码块
        Myclass csone = new Myclass();
        Myclass cstwo = new Myclass();
        csone.method();
        Myclass.methodStatic();
    }
}
