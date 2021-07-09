package cn.dsq4.JDBC4;

import java.sql.*;

/**
 * @author: 段市庆
 * @date: 2021/7/7 15:58
 * @Description:JDBC快速入门
 */


public class JdbcDome1 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动
        //2.注册驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //3.获取数据库连接对象
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="ckjdev2";
        String password = "ckjdev2";
        Connection con = DriverManager.getConnection(url, username, password);
        //4.定义sql语句
        String sql="SELECT CUST_NO,MEDIA_NO FROM T1_CUST_ACCT_INFO";
        //5.获取执行SQL的对象 Statement
        Statement stmt = con.createStatement();
        //6.执行sql
        ResultSet rst = stmt.executeQuery(sql);
        //7.输出结果
        while(rst.next()){
            String CUST_NO = rst.getString("CUST_NO");
            String MEDIA_NO=rst.getString("MEDIA_NO");
            System.out.println("客户号:"+CUST_NO+",证件号:"+MEDIA_NO);
        }
        //释放资源
        stmt.close();
        con.close();


    }
}
