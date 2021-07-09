package cn.dsq4.web1;

/**
 * @author: 段市庆
 * @date: 2021/6/18 10:58
 */

/*
1.JDK中的注解
2.自定义注解
3.使用注解
*/

@SuppressWarnings("all")
public class Test470Annotation {

    //JDk中的注解，@Oveeride、@Deprecated、@SuppressWarning

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    //加了@Deprecated注解后，该方法的放射会被加划线
    public void show1(){}


    @SuppressWarnings("all")
    //压制编译工具（IDEA） 对方法的警告，（不显示警告）. 一般该注解被作用在类上
    public void shouw2(){}






}
