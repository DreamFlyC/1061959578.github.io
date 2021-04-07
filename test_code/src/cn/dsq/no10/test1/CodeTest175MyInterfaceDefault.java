package cn.dsq.no10.test1;


/*
* 从java8 开始，接口允许定义默认方法。
* 格式：
* public default 返回值类型 方法名称(参数列表){
*       //方法体
* }
*
* 备注：接口当中的默认方法，可以解决接口升级的问题
* */
public interface CodeTest175MyInterfaceDefault {

    //抽象方法
    public abstract  void methodAbs();

    //再A类 和b类 实现第一个接口后新增第二个抽象，会导致类报错。所以可以使用默认方法
//    public abstract  void methodAbs2();

    //新添加的方法改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加默认方法");
    }
}
