package cn.dsq2.test13;

import java.io.*;

/**
 * @author 段市庆
 * @date 2021/4/21 22:16
 */

/*
demo01
java.io.BufferedWriter
public class BufferedWriter extends Writer

构造方法：
BufferedWriter(Writer out):创建一个使用默认大小输出缓冲区的缓冲字符输出流。
BufferedWriter(Writer out, int sz):创建一个使用给定大小输出缓冲区的新缓冲字符输出流。

特有的成员方法：
     void	newLine(): 写入一个行分隔符。行分隔符字符串由系统属性 line.separator 定义，并且不一定是单个新行 ('\n') 符。

*/

/*
demo02
java.io.BufferedReader
public class BufferedReader extends Reader

构造方法：
BufferedReader(Reader in)：创建一个使用默认大小输入缓冲区的缓冲字符输入流。
BufferedReader(Reader in, int sz)：创建一个使用指定大小输入缓冲区的缓冲字符输入流。

特有方法：
 String	readLine()：读取一个文本行。
    包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null

*/
public class Test387BufferedChar {
    public static void main(String[] args) throws IOException {
        //BufferedWrite
//        demo01();
        //BufferedReader
        demo02();
        //练习：文本排序
        demo03();
    }

    private static void demo03() {
    }

    //BufferedReader
    private static void demo02() throws IOException {
        //1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("cc.text"));
        //2.使用字符换出输入流对象中的方法读取文本
        String line;
        while((line = br.readLine())!= null){
            line = br.readLine();
            System.out.println(line);
        }

        //3.释放资源
        br.close();
    }

        //BufferedWrite
    private static void demo01() throws IOException {
        //1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("cc.text") );
        //2.调用字符缓冲输出流中的方法Write，把数据写入到内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("啧啧");
            bw.newLine();
        }
        //3.将缓冲区字符刷新到文件中
        bw.flush();
        //4.释放资源
        bw.close();
    }
}
