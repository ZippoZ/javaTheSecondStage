package jdbc.jdbc20160719;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/19.
 */
public class Master {
    static final String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
    static final String userName = "system";
    static final String powerWord = "12345678";
    static final String dirver = "oracle.jdbc.OracleDriver";
    /**
     *  注册方法
     * @param name 用户名
     * @param pwd 密码
     */
    public static boolean add(String name,String pwd){
        Connection connection =null;
        Statement statement =null;
        ResultSet resultSet =null;
        int row = 0;
        try {
            //加载驱动类
            Class.forName(dirver);
            //DriverManager对象的getConnection与数据库建立连接
            connection = DriverManager.getConnection(url,userName,powerWord);
            //通过statement对sql操作
            statement = connection.createStatement();
            //通过statement对象进行操作
            String sql = "INSERT INTO t_master(id,name,pwd) VALUES (seq_t_master.nextval,'"+name+"','"+pwd+"')";
             row = statement.executeUpdate(sql);
            if (row > 0){
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (statement!=null)
                    statement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public  static boolean  recharge(String name, int money){
        Connection connection =null;
        Statement statement =null;
        ResultSet resultSet =null;
        int row = 0;
        try{
            //加载驱动类
            Class.forName(dirver);
            //DriverManager对象的getConnection与数据库建立连接
            connection = DriverManager.getConnection(url,userName,powerWord);
            //通过statement对sql操作
            statement = connection.createStatement();
            String sql =String.format("UPDATE  t_master SET money = money+%d WHERE name = '%s'", money,name);
            row = statement.executeUpdate(sql);
            if (row > 0){
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (statement!=null)
                    statement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
    public static boolean delete(String name){
        Connection connection =null;
        Statement statement =null;
        ResultSet resultSet =null;
        int row = 0;
        try{
            //加载驱动类
            Class.forName(dirver);
            //DriverManager对象的getConnection与数据库建立连接
            connection = DriverManager.getConnection(url,userName,powerWord);
            //通过statement对sql操作
            statement = connection.createStatement();
            String sql = String.format("DELETE t_master WHERE name='%s'",name);
            row = statement.executeUpdate(sql);
            if (row > 0){
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (statement!=null)
                    statement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢饮注册：");
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String pwd = scanner.next();
        boolean flag = add(name,pwd);
        if (flag == true){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
        System.out.println("是否要充值元宝(最大99个元宝)：");
        int money = scanner.nextInt();
        boolean flag1 = recharge(name,money);
        if (flag1 == true){
            System.out.println("充值成功");
        }else {
            System.out.println("充值失败");
        }
        System.out.println("请输入你要永久注销的用户名：");
        String name1 = scanner.next();
        boolean flag2 = delete(name1);
        if (flag1 == true){
            System.out.println("注销成功");
        }else {
            System.out.println("注销失败");
        }
    }
}
