package cn.dsq.no9;

public class CodeTest155ExtendMethod {
    public static void main(String[] args) {

        //继承变量的调用       优先对象(等号左边)

        Zi zi = new Zi();
        zi.printnum();
        System.out.println(zi.num);

        //方法重名  优先创建类本身（等号右边)
        zi.Method();

        //多态的情况
        Fu zi1=new Zi();
        zi1.Method();
        System.out.println(zi1.num);    //10
        System.out.println(zi.num);     //20

        //super 子类方法访问父类方法
        zi.Method3();
    }
}
