package cn.dsq4.JDBC4;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author: 段市庆
 * @date: 2021/7/9 18:02
 * @Description:JDBC工具类
 */
public class Test552JDBCUtils {
    //获取连接所需要的变量
    private static String url;
    private static String username;
    private static String password;
    private static String driver;
    static {

        try {
            Properties pro = new Properties();
            //获取文件路径，ClassLoader类加载器
            ClassLoader classLoader = Test552JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("test_code/src/pro.properties");
            pro.load(new FileReader(res.getPath()));
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //通过静态代码块，只读取一次拿到获取连接所需要的数据
    //获取链接的方法
    public  static Connection getConnection(){
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static void close(Statement stmt,Connection con){
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(ResultSet rst,Statement stmt,Connection con){
        try {
            if (rst != null) {
                rst.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    };

}
