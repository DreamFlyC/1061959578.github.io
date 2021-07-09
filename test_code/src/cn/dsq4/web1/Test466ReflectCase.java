package cn.dsq4.web1;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author: 段市庆
 * @date: 2021/6/17 15:19
 */

/*
    需求：写一个框架，不能改变类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
        实现：配置文件、反射
        步骤：
            1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
            2.在程序中加载读取配置文件
            3.使用反射技术来加载类文件进内存
            4.创建对象
            5.执行方法

*/
public class Test466ReflectCase {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties pro = new Properties();
        ClassLoader classLoader = Test466ReflectCase.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //获取配置文件数据
        String classname = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //加载该类进内存
        Class cls = Class.forName(classname);
        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
         method.invoke(obj);


    }
}
