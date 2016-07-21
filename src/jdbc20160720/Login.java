package jdbc20160720;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/20.
 */
public class Login {
    static final String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
    static final String userName = "system";
    static final String powerWord = "12345678";
    static final String dirver = "oracle.jdbc.OracleDriver";

    /**
     * 对数据库的链接等封装
     *
     * @param sql sql 语句
     */
    private static Boolean Conn(String sql) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(dirver);
            //DriverManager对象的getConnection与数据库建立连接
            connection = DriverManager.getConnection(url, userName, powerWord);
            //通过statement对sql操作
            statement = connection.createStatement();
            if (sql.contains("select")) {
                resultSet = statement.executeQuery(sql);
                if (resultSet.next())
                    return false;
            }else {
                int row = statement.executeUpdate(sql);
                if (row > 0)
                    return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     *  用户注册，如果有这个用户名则注册失败，没有则注册成功
     * @param name 用户名
     * @return 是否注册成功
     */
    public static Boolean log(String name,String pwd){
        String sql = String.format("SELECT * FROM t_master WHERE name = '%s'",name);
        Boolean flag = Conn(sql);
        if (flag == true){
            String sql1 = "INSERT INTO t_master(id,name,pwd) VALUES (seq_t_master.nextval,'"+name+"','"+pwd+"')";
            return Conn(sql1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("注册/登入 请选择：");
        String ch = scanner.next();
        if ("注册".equals(ch)){
            System.out.print("请输入用户名：");
            String name = scanner.next();
            System.out.print("请输入密码：");
            String pwd = scanner.next();
            Boolean flag =  log(name,pwd);
            if (flag)
                System.out.println("注册成功！！！");
            else
                System.err.println("注册失败！！！");
        }
    }
}
