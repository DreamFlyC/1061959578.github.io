package cn.dsq3.no2;

/**
 * @author 段市庆
 * @date 2021/5/7 23:00
 */

/*
    函数式接口：有且仅有一个抽象方法的接口，但是接口中可以包含其他的方法（默认，静态，私有）

    @FunctionalInterface 注解： 检测接口是否是一个函数式接口
*/

@FunctionalInterface
public interface Test418FunctionalInterface {
    public abstract void method();
}
