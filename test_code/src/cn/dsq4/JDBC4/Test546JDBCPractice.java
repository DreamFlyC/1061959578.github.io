package cn.dsq4.JDBC4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: 段市庆
 * @date: 2021/7/9 10:50
 * Description:JDBC练习1
 * 表新增一条数据
 * 表修改一条数据
 * 表删除一天数据
 */
public class Test546JDBCPractice {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;

        try {
            //导入驱动
            //注册驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //连接数据库
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "ckjdev2";
            String password = "ckjdev2";
            con = DriverManager.getConnection(url, username, password);
            //定义sql语句
            String ins = "INSERT INTO HOST_CUST_BALANCE (SMART_TRANS_ACCT_NO ,CURR_USEABLE_BALANCE ,CURR_BALANCE ,TRANS_DATE ) VALUES(123458,100000,100000,20210709)";
            String upd = "UPDATE HOST_CUST_BALANCE SET CURR_BALANCE =99999 WHERE SMART_TRANS_ACCT_NO =123457";
            String del = "DELETE FROM HOST_CUST_BALANCE WHERE SMART_TRANS_ACCT_NO =123456";
            //获取执行sql对象
            stmt = con.createStatement();
            //执行sql
            int r1 = stmt.executeUpdate(ins);
            int r2 = stmt.executeUpdate(upd);
            int r3 = stmt.executeUpdate(del);
            if (r1 > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
            ;
            if (r2 > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
            if (r3 > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
                if(con!=null){
                    con.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }





        }


    }
}
