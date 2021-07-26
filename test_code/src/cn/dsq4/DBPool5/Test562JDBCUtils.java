package cn.dsq4.DBPool5;

import cn.dsq4.JDBC4.Test552JDBCUtils;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author: 段市庆
 * @date: 2021/7/15 14:14
 * @Descripttion： JDBC 连接池 工具类
 */
public class Test562JDBCUtils {
    //定义成员变量
    private static DataSource ds;


    static {
        //加载配置文件

        try {
            Properties pro = new Properties();
            pro.load(Test552JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //获取数据库资源
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 释放资源
     */
    public static void close(Statement stmt, Connection con) {

//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            }
//
//            if (con != null) {
//                try {
//                    con.close();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            }

        close(null, stmt, con);

    }

    public static void close(ResultSet rst, Statement stmt, Connection con) {

        if (rst != null) {
            try {
                rst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 获取连接池
     * */
    public static DataSource getDataSource(){
        return ds;
    }
}
