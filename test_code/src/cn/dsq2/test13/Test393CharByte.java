package cn.dsq2.test13;

import java.io.*;

/**
 * @author 段市庆
 * @date 2021/4/27 23:55
 */

/*
java.io 类 OutputStreamWriter
public class OutputStreamWriter extends Writer
作用：OutputStreamWriter 是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。它使用的字符集可以由名称指定或显式给定，否则将接受平台默认的字符集。

构造方法：
    OutputStreamWriter(OutputStream out)：创建使用默认字符编码的 OutputStreamWriter。
    OutputStreamWriter(OutputStream out, String charsetName)：创建使用指定字符集的 OutputStreamWriter。
*/

/*
public class InputStreamReader extends Reader
InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。

构造方法：
InputStreamReader(InputStream in)：创建一个使用默认字符集的 InputStreamReader。
InputStreamReader(InputStream in, String charsetName)：创建使用指定字符集的 InputStreamReader。

*/
public class Test393CharByte {
    public static void main(String[] args) throws IOException {
        //1.已指定格式输出字符
        demo01();
        //2.读取指定格式字符
        demo02();
    }

    private static void demo02() throws IOException {
        //创建InPutStreamReader对象，指定编码格式
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test_code/src/cn/dsq2/test13/cc.text"),"GBK");
        //获取字节
        char[] cs = new char[1024];
        int len=0;
        while ((len = isr.read(cs))!=-1){
            System.out.println(len);
            System.out.println(cs);
            System.out.println((char) len);
//            System.out.println(new String(cs));
        }
        isr.close();

    }

    private static void demo01() throws IOException {
        //1.创建OutPutStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test_code/src/cn/dsq2/test13/cc.text"),"GBK");
//        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("src/cn/dsq2/test13/cc.text"),"utf-8");
        //2.使用对象的方法write，把字符转换为字节 存储到缓冲区
        osw.write("你好");
        //
        osw.flush();
        //关闭资源
        osw.close();

    }
}
