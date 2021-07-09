package cn.dsq4.JDBC4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 段市庆
 * @date: 2021/7/9 16:39
 * @Description:表封装为类的练习2
 */
public class Test551JDBCPractice2 {
    public static void main(String[] args) {
        List<Test551HostCustBalance> list = new Test551JDBCPractice2().findAll();
        System.out.println(list);
    }

    //定义一个方法，查询host_cust_balance表的数据，并将其封装为对象，然后装载集合，返回。

    /*
     * 查询所有HostCustBalance对象
     * @return
     * */
    public List<Test551HostCustBalance> findAll() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rst = null;
        List<Test551HostCustBalance> listhcb = null;

        //导入驱动
        //注册驱动
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //连接数据库
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "ckjdev2";
            String password = "ckjdev2";
            con = DriverManager.getConnection(url, username, password);
            //4.定义sql语句
            String sql = "SELECT * FROM HOST_CUST_BALANCE";
            //5.获取执行SQL的对象 Statement
            stmt = con.createStatement();
            //6.执行sql
            rst = stmt.executeQuery(sql);
            //7.输出结果
            Test551HostCustBalance hcb = null;
            listhcb = new ArrayList<Test551HostCustBalance>();
            while (rst.next()) {
                int SMART_TRANS_ACCT_NO = rst.getInt("SMART_TRANS_ACCT_NO");
                int CURR_USEABLE_BALANCE = rst.getInt("CURR_USEABLE_BALANCE");
                int CURR_BALANCE = rst.getInt("CURR_BALANCE");
                int TRANS_DATE = rst.getInt("TRANS_DATE");
                //创建对象
                hcb = new Test551HostCustBalance();
                hcb.setSMART_TRANS_ACCT_NO(SMART_TRANS_ACCT_NO);
                hcb.setCURR_USEABLE_BALANCE(CURR_USEABLE_BALANCE);
                hcb.setCURR_BALANCE(CURR_BALANCE);
                hcb.setTRANS_DATE(TRANS_DATE);

//                装载到集合
                listhcb.add(hcb);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

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

            return listhcb;
        }
    }
}
