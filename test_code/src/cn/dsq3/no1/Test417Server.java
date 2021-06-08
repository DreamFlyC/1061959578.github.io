package cn.dsq3.no1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 段市庆
 * @date 2021/5/6 21:05
 * 模拟BS服务器
 */
public class Test417Server {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket serverSocket = new ServerSocket(8888);
        //获取客户端对象(浏览器)
        Socket socket = serverSocket.accept();
        //使用网络字节输入流，读取客户端的请求信息
        InputStream is = socket.getInputStream();

//        int len=0;
//        byte[] bytes = new byte[1024];
//        while ((len = is.read(bytes)) != -1){
//            System.out.println(new String(bytes,0,len));
//        }

        //把is网络字节输入流对象，转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端请求信息的第一行读取出来
        String line = br.readLine();
        //对信息进行处理
        String[] arr = line.split(" ");
        String htmlpath = arr[1].substring(1);
//        System.out.println(htmlpath);

        //读取本地html文件
        FileInputStream fis = new FileInputStream(htmlpath);
        OutputStream os = socket.getOutputStream();

        //输入回显信息给客户端
        os.write("Http/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        //一读一些复制文件，把服务器文件给客户端
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
           os.write(bytes,0,len);
        }

        //释放资源
        fis.close();
        socket.close();
        serverSocket.close();
    }
}
