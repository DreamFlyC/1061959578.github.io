package cn.dsq4.web1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: 段市庆
 * @date: 2021/6/25 11:22
 */
public class Test475RunMain {
    public static void main(String[] args) throws IOException {
        //创建计算机对象
        Test460Calculator cal = new Test460Calculator();
        //获取字节码文件对象
        Class<? extends Test460Calculator> calClass = cal.getClass();
        //获取对象所有方法
        Method[] methods = calClass.getMethods();

        int errornum = 0; // 异常出现的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("BugReport.txt"));

        //根据方法是否有Check注解，判断是否执行
        for (Method method : methods) {
            if(method.isAnnotationPresent(Test475Check4.class)) {
                try {
                    method.invoke(cal,2,0);
                } catch (Exception e) {
//                    e.printStackTrace();
                    errornum++;
                    bw.write(method.getName()+"方法出现异常");
                    bw.newLine();
                    bw.write("异常名称:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-----------------------------");
                    bw.newLine();

                }
            };
        }
        bw.write("本次测试一共出现"+errornum+"次异常");
        bw.flush();
        bw.close();
    }
}
