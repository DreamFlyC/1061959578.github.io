package cn.dsq2.test12;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
字节输入输入操作原理： class-->JVM-->os系统-->硬盘内存

java.io 类 InputStream:此抽象类是表示字节输入流的所有类的超类
    常用方法：
         void	close()：关闭此输入流并释放与该流关联的所有系统资源。
         abstract  int	read()：从输入流中读取数据的下一个字节。
         int	read(byte[] b)：从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
         int	read(byte[] b, int off, int len)：将输入流中最多 len 个数据字节读入 byte 数组。
java.io 类 OutputStream:此抽象类是表示输出字节流的所有类的超类。输出流接受输出字节并将这些字节发送到某个接收器。
    常用方法：
         void	close()：关闭此输出流并释放与此流有关的所有系统资源。
         void	write(byte[] b)：将 b.length 个字节从指定的 byte 数组写入此输出流。
         void	write(byte[] b, int off, int len)：将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
         abstract  void	write(int b)：将指定的字节写入此输出流。

本节练习子类：FileInputStream,FilterOutputStream
    了解构造方法：
*/
public class IoStream {
    public static void main(String[] args) throws IOException {
        //tip:需要注意 输入输出流都是字节。
        /*
            字节输入流问题：
                字节输入路径
                字节单个，多个输入；字节续写输入
        */

        //FileOutputStream
//        demo01();

        //FileInputStream
        demo02();

    }

    private static void demo02() throws IOException {
        //创建对象
        File file = new File("cc.text");
        FileInputStream finput = new FileInputStream(file);

//        //读取单个字符
//        int rd1 = finput.read();
//        System.out.println(rd1);                //>>>65
//        System.out.println((char) rd1);         //>>>A
//        int rd2 = finput.read();
//        int rd3 = finput.read();
//        System.out.println(rd3);                //>>>10
//        System.out.println((char) rd3);
//        int rd4 = finput.read();
//        System.out.println(rd4);                //>>>67
//        System.out.println((char) rd4);         //>>>C
//
        //循环读取
//        int len =0;
//        for (len = 0; len!=-1 ;) {
//            len=finput.read();
//            System.out.println(len);
//        }

        //一次读取多个字符
//        byte[] by=new byte[2];
//        int len = finput.read(by); //这里的len 为读取字符的个数
//        System.out.println(len);        //>>>2
//        System.out.println(new String(by));             //>>>AB
        byte[] by = new byte[1024];
        int len;
        while ((len = finput.read(by)) != -1) {
            System.out.println(len);
            System.out.println(new String(by));
        }


        //读取多个字符

        //关闭资源
        finput.close();
    }

    private static void demo01() throws IOException {
        File file = new File("cc.text");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //写入单个字符 97 -> a
        fileOutputStream.write(97);
        //写入多个字符
        byte[] by = {97, 98, 99};
        fileOutputStream.write(by);
        // 注意事项，以上每次重写字符会清楚文本原油字符
        FileOutputStream fo2 = new FileOutputStream(file);
        fo2.write(97);
        //文件续写，添加参数true
        FileOutputStream fo3 = new FileOutputStream(file, true);
        fo3.write(97);
        //输出换行, 注意linux 和 window 的换行符不一样
        fo3.write("\n".getBytes(StandardCharsets.UTF_8));
        fo3.write(97);
        //关闭资源
        fileOutputStream.close();
    }
}
