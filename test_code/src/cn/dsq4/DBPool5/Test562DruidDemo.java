package cn.dsq4.DBPool5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: 段市庆
 * @date: 2021/7/15 14:32
 */
public class Test562DruidDemo {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rst = null;
        try {
            con = Test562JDBCUtils.getConnection();
            String sql = "UPDATE HOST_CUST_BALANCE SET CURR_BALANCE =99999 WHERE SMART_TRANS_ACCT_NO =123457";
            stmt = con.createStatement();
            int i = stmt.executeUpdate(sql);
            System.out.println(i);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("连接失败");
        }finally {
            Test562JDBCUtils.close(rst,stmt,con);
        }
    }
}
