package cn.test;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
        TCP通信客户端:
        表示客户端的类：java.net.Socket。

        构造方法：
            Socket(String host, int port):创建一个流套接字并将其连接到指定主机上的指定端口号。

        成员方法；
        OutputStream	getOutputStream()：返回此套接字的输出流。
        InputStream	getInputStream()：返回此套接字的输入流。
        void	close()：关闭此套接字。

        注意：
            1.客户端和服务器端进行交互，必须使用Cocket中提供的网络流，不能使用自己创建的流对象
            2.当我们创建客户端对象Socket的时候，就会去请求服务器和服务器经过3次握手建立链接
                这个时候如果服务器没有启动，那么就会抛出异常
                如果服务器已经启动，那么就可以进行交互
*/
public class Test410TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象
        Socket socket = new Socket("127.0.0.1",8888);
        //创建获取网络自己输出流对象
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出对象的writ方法，给服务器发送数据
        os.write("hello".getBytes());
        //获取输入流对象
        //读取服务器回写数据
        //释放资源
        socket.close();
    }
}

























