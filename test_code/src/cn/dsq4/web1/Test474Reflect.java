package cn.dsq4.web1;

/**
 * @author: 段市庆
 * @date: 2021/6/20 21:59
 */

/*
    使用注解来，应用反射
*/
    @Test474Pro(className = "cn.dsq4.web1.Test467Person",methodName = "eat")
public class Test474Reflect {
    public static void main(String[] args) {
        //结息注解
        //或区域类的字节码文件对象
        Class<Test474Pro> pc = Test474Pro.class;
        //获取注解对象
        Test474Pro an = pc.getAnnotation(Test474Pro.class);//其实是在内存中生成了一个该注解接口的子类实现对象
        String className = an.className();
        String methodName = an.methodName();



















    }
}
