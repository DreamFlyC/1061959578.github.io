package cn.dsq3.no1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 段市庆
 * @date 2021/5/6 20:19
 */

public class Test413Server {
    public static void main(String[] args) throws IOException {
        //创建服务器，并指定端口
        ServerSocket sever = new ServerSocket(8888);
        //获取客户端的Socket对象
        Socket socket = sever.accept();
        //使用网络字节输入流，获取输入数据
        InputStream is = socket.getInputStream();
        //判断指定存放文字是否存在
        File file = new File("test_code/src/cn/dsq3/no1");
        if(!file.exists()){
            file.mkdirs();
        }
        //通过本地字节输出流，把数据输出到目的地
        FileOutputStream fos = new FileOutputStream(file+"\\2.txt");
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //通过网络字节输出流，告知上传成功
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());


        //释放资源
        fos.close();
        socket.close();
        sever.close();

    }
}
