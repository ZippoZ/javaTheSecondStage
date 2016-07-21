package jdbc20160720;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/20.
 */
public class Log {
    /**
     * 定义静态的常量
     */
    static final String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
    static final String userName = "system";
    static final String powerWord = "12345678";
    static final String dirver = "oracle.jdbc.OracleDriver";

    /**
     *  登入的方法
     * @param name 姓名
     * @param pwd 密码
     * @return 是否完成操作
     */
    private static boolean login(String name,String pwd){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            /**
             * 加载驱动类
             */
            Class.forName(dirver);
            /**
             * 通过driverManager.getConnection返回一个connection对象
             */
            connection = DriverManager.getConnection(url,userName,powerWord);
            /**
             * 通过connection.prepareStatement返回一个preparedStatement对象
             */
            String sql = "select * from t_master where name = ? and pwd = ?";
            preparedStatement = connection.prepareStatement(sql);
            /**
             * 添加数据
             */
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,pwd);
            /**
             * 执行语句
             */
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            /**
             * 关闭数据库
              */
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 测试方法
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name  = scanner.next();
        System.out.println("请输入密码：");
        String pwd = scanner.next();
        Boolean flag =  login(name,pwd);
        if (flag)
            System.out.println("登入成功");
        else
            System.err.println("登入失败");
    }
}
