package cn.dsq2.test12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 段市庆
 * @date 2021/4/8 9:24
 */

/*
字符流
超类：Reader 、 Writer
子类：FileReader、FileWriter
    构造方法：
    读取原理：
*/
public class Test371CharStream {
    public static void main(String[] args) throws IOException {
        //Reader-->FileReader
//        demo01();

        //Writer-->FileWriter ，tip:flush
        demo02();
    }

    private static void demo02() throws IOException {
        File file = new File("cc.text");
        FileWriter fw = new FileWriter(file);
        //Writer 会将字节写入到  缓冲区。 然后用flush再把缓冲区的字符输出到文本上
        fw.write(97);
        fw.write("你好");
        fw.flush();


        //关闭资源，close 也会把缓冲区 没输出到文本上的字符 输出到文本上
        fw.close();
    }

    private static void demo01() throws IOException {
        File file = new File("cc.text");
        //创建对象
        FileReader fr = new FileReader(file);

        //读取数据（单个读取）
        int len;
//        while ((len = fr.read())!=-1){
//            System.out.print(len + ":"+(char)len);
//        }

        //读取数据，多个读取
        char[] cs = new char[1024];
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs));
        }
        //关闭资源
        fr.close();
    }
}
