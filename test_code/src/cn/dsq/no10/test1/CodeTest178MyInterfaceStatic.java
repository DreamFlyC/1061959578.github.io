package cn.dsq.no10.test1;


/*
* 从java8中开始，接口当中允许定义静态方法。
* 格式：
* publice static 返回值类型 方法名称(参数列表){
*       //方法体
* }
*
* */
public interface CodeTest178MyInterfaceStatic {

    public static  void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}
