package cn.dsq.no11.test1;

/*
当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就不能覆盖重写
格式：
修饰符 final 返回值类型 方法名称（参数列表）{
    //方法体
}

对于类、方法来水，abstract 关键字和final 关键字不能同时使用，会导致矛盾
*/
public class Codetest197Fu {

    public void  method() {
        System.out.println("父类方法");
    }

    public final void  methodFinal(){
        System.out.println("父类final方法");
    }

//    public abstract final void  method3();        //会编译报错

}
