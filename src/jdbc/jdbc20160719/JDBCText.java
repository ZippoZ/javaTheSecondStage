package jdbc.jdbc20160719;

import javax.xml.crypto.Data;
import java.sql.*;

/**
 * Created by Zippo on 2016/7/19.
 */
public class JDBCText {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        try {
            //加载数据库
            Class.forName("oracle.jdbc.OracleDriver");
            /**
             * 通过DriverManager的getConnection方法与数据库建立连接
             */
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","system","12345678");
            /**
             * 通过Connection对象对象得到statement对象，用于执行sql语句
             */
            statement = connection.createStatement();
            /**
             * 通过statement对象执行sql语句，返回一个结果集Resulst
             */
            String sql = "select * from scott.emp";
            result = statement.executeQuery(sql);
            /**
             * 处理结果集
             */
            while(result.next()){
                int empno = result.getInt(1);
                String name = result.getString(2);
                String job = result.getString(3);
                int mar = result.getInt(4);
                Date hirDate = result.getDate(5);
                float sal = result.getFloat(6);
                float comm = result.getFloat(7);
                int deptno = result.getInt(8);
                System.out.println(empno+"\t"+name+"\t"+job+"\t"+mar+"\t"+hirDate+"\t"+sal+"\t"+
                comm+"\t"+deptno);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /**
         * 关闭服务
         */
        finally {
                try {
                    if (result!=null)
                        result.close();
                    if (statement!=null)
                        statement.close();
                    if (connection!=null)
                        connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}
