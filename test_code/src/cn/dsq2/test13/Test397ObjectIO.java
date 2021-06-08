package cn.dsq2.test13;

import java.io.*;

/**
 * @author 段市庆
 * @date 2021/4/29 19:45
 */

/*
public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants
    ObjectOutputStream  : 对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
 	    ObjectOutputStream(OutputStream out)：创建写入指定 OutputStream 的 ObjectOutputStream。
 	特有的成员方法：
 	    void	writeObject(Object obj)：将指定的对象写入 ObjectOutputStream。
*/

/*
public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants
ObjectInputStream：对象的反序列化流
作用：把文件中保存的对象，以流的方式读取出来使用

构造方法：
    	ObjectInputStream(InputStream in)：创建从指定 InputStream 读取的 ObjectInputStream。

特有方法：
     Object	readObject()：从 ObjectInputStream 读取对象。
*/

/*
    关键字：transient 瞬态关键字
        被transient修饰的成员变量，不能被序列化
     序列号冲突问题， 可以使用静态成员手动生成 序列号 static final long serialVersionUID = 42L;
*/
public class Test397ObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectOutputStream
        demo01();
        //ObjectInputStream
        demo02();

    }

    private static void demo02() throws IOException, ClassNotFoundException {
        //创建ObjectInputStream对象，构造传递字节输出流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test_code/src/cn/dsq2/test13/cc.text"));
        //使用方法对用对象
        Object o = ois.readObject();
        System.out.println(o);
        //关闭资源
        ois.close();
    }

    private static void demo01() throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test_code/src/cn/dsq2/test13/cc.text"));
        //使用ObjectOutputStream对象中的方法WriteObject，把对象写入文件中
        // 序列化和反序列化，需要实现 java.io 接口 Serializable
        oos.writeObject(new Test397Person("小美女",18));
        //关闭资源
        oos.close();

    }
}







