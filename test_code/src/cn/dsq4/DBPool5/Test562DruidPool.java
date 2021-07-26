package cn.dsq4.DBPool5;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author: 段市庆
 * @date: 2021/7/12 17:28
 * @Description：Druid连接池演示
 */
public class Test562DruidPool {
    public static void main(String[] args) throws Exception {
        //导入jar包
        //定义配置文件
        //3.加载配置文件
        Properties pro = new Properties();
        //获取对象属性的Classd对象——>获取类加载器——>获取指定文件名称资源得输入流
        InputStream res = Test562DruidPool.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(res);
        //获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection con = ds.getConnection();
        System.out.println(con);
        con.close();


    }
}
