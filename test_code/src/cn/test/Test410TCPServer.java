package cn.test;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    TCP通信的服务器端
    标识服务器的类：java.net.ServerSocket

    构造方法：
        ServerSocket(int port):创建绑定到特定端口的服务器套接字。

    成员方法:
        
*/
public class Test410TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket server = new ServerSocket(8888);
        //获取请求的客户端对象
        Socket socket=server.accept();
        //获取网络字节输入流对象
        InputStream is=socket.getInputStream();
        //读取输入流数据
        byte[] bytes = new byte[1024];
        int len =is.read(bytes);
        System.out.println("客户端输出字符:"+new String(bytes,0,len));
        //获取网络字节流输出对象
        OutputStream os = socket.getOutputStream();
        //给客户端写数据
        os.write("me too".getBytes());
        //释放资源
        socket.close();
        server.close();

    }
}
