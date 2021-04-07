package cn.dsq2.test08;

import java.io.FileNotFoundException;

/*
    throws关键字：
        将问题标识出来，报告给调用者。 提醒调用者处理异常（或交给JVM处理）
     格式： 在方法声明时候使用
        修饰符 返回值类型 方法名称(参数) throws 异常类{
            throw new 异常对象();
        }

     注意：
        1.throws必须在方法声明处
        2.throw关键字后边声明的异常需要是Eception及其子类
        3.throws如果抛出多个异常， 且异常用继承关系的时候，我们可以只写父类
        4.调用throws关键字的方法后，必须要处理throws抛出的异常
*/
public class Test293throws {
    public static void main(String[] args) {
        try {
            demo01("c:\\xx");
        } catch (FileNotFoundException e) {
            System.out.println("调用声明异常的方法后，需要处理异常");
            e.printStackTrace();
        }
    }

    private static void demo01(String filename) throws FileNotFoundException {
        if(!filename.equals("c:\\xx")){
            throw new FileNotFoundException("找不到文件");
        }
    }
}
