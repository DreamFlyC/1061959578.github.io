package cn.dsq3.no1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 段市庆
 * @date 2021/5/6 20:07
 */

public class Test413Client {
    public static void main(String[] args) throws IOException {
        //创建一个本地字节输入流，FileInputStream，
        FileInputStream fis = new FileInputStream("test_code/src/cn/dsq3/no1/cc.text");
        //创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //使用Socket中的方法getOutputSteam，获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //使用本地字节输入流FileInputStream对象中的方法read，读取本地文件.并写入到服务器
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) !=-1){
            os.write(bytes,0,len);
        }

        //告诉服务器数据读取结束
        socket.shutdownOutput();

        //获取网络字节输入流对象，和本地字节输入流对象
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //关闭资源
        fis.close();
        socket.close();
    }
}
