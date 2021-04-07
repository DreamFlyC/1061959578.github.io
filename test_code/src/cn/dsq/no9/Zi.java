package cn.dsq.no9;

public class Zi extends Fu {
    /*
    *继承关系中，父子类构造方法的访问特点
    *
    * 1.子类构造方法当中有一个默认隐含的"super()"调用，所以一定是先调用的父类构造，后执行的子类构造
    * 2.子类构造可以通过super关键字来调用父类重载构造
    * 3.super父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造
    */
    /*
    * super关键字的用法
    * 1.在子类的成员方法中，访问父类的成员变量
    * 2.在子类的成员方法中，访问父类的成员方法
    * 3.在子类的构造器中，访问父类的构造器方法
    */
    /*
    *this关键字的用法 用来访问本来内容
    * 1.在本类的成员方法/构造器中，访问本类的成员变量
    * 2.在本类的成员方法/构造器中，访问本类的另一个成员方法
    * 3.在本类的构造器中，访问本类的另一个构造方法。
    * 在第三种方法中要注意：this（...)调用必须是构造方法的第一个语句。
    */
    int num = 20;

    public Zi(int num) {
        this.num = num;
    }

    public Zi() {
//        super();
        super(20);
        this.num = 30;
//        this(123);    //this()调用构造方法也必须放第一个语句
    }


    public void printnum(){
        int num = 30;
        System.out.println("成员变量是："+num);        //输出成员Num
        System.out.println("子类变量是："+this.num);   //输出子类Num
        System.out.println("父类变量是："+super.num);  //输出父类Num
    }

    /*
    方法覆盖重写的注意事项
    1.必须保证父子类方法的名称相同，参数相同。可以用@Override 检测
    @Override :写在方法前面，用来检测是不是有效的正确覆盖重写。 @表示注解 ，注解也可以不写
    2.子类方法的返回值必须小于等于父类方法的返回值范围
    3.子类方法的权限必须大于等于父类方法的权限修饰符
    publc > protected >(default) > private
    备注：(default) 不是关键字default，而是为空
    */
    @Override
    public void Method(){
        System.out.println("子类方法执行");
    }

    @Override
    public String Method2() {
        // 返回值类型Sting 在 父类返回值Object 范围类
        return null;
    }

    public void Method3(){
        super.Method();
    }
}
