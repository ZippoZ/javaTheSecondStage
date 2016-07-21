package jdbc20160720;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/20.
 */
public class DogText{
    static final String url = "jdbc:oracle:thin:@//localhost:1521/orcl";
    static final String userName = "system";
    static final String powerWord = "12345678";
    static final String dirver = "oracle.jdbc.OracleDriver";

    /**
     * 添加狗
     * @param dog 狗
     * @return 是否添加成功
     */
    public static boolean insert(Dog dog){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            //加载驱动
            Class.forName(dirver);
            //DriverManager.getConnection返回connection对象
            connection = DriverManager.getConnection(url,userName,powerWord);
            //要添加的sql语句
            String sql = "INSERT INTO t_Dog(id,name,health,love,strain) VALUES (sql_t_Dog.nextval,?,?,?,?)";
            //connection.prepareStatement返回preparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            //处理sql语句
            preparedStatement.setString(1,dog.getName());
            preparedStatement.setInt(2,dog.getHealth());
            preparedStatement.setInt(3,dog.getLove());
            preparedStatement.setString(4,dog.getStrain());
            //将sql语句，传到数据库处理
            int row = preparedStatement.executeUpdate();
            //如果添加成功返回true
            if (row > 0){
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭数据库,有力往外关闭
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     *  修改的方法
     * @param dog 狗
     * @return 是否修改成功
     */
    public static  Boolean alter(Dog dog){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            //加载驱动
            Class.forName(dirver);
            //DriverManager.getConnection返回connection对象
            connection = DriverManager.getConnection(url, userName, powerWord);
            //要添加的sql语句
            String sql = "UPDATE t_Dog SET name = ? WHERE id =?";
            //处理sql语句
            preparedStatement.setString(1, dog.getName());
            preparedStatement.setInt(2,dog.getId());
            //将sql语句，传到数据库处理
            int row = preparedStatement.executeUpdate();
            //如果添加成功返回true
            if (row > 0){
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭数据库,有力往外关闭
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 删除的方法
     */
    public static Boolean delete(Dog dog){
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            //加载驱动
            Class.forName(dirver);
            //DriverManager.getConnection返回connection对象
            connection = DriverManager.getConnection(url, userName, powerWord);
            //要添加的sql语句
            String sql = "DELETE t_Dag WHERE name = ?";
            //处理sql语句
            preparedStatement.setString(1, dog.getName());
            //将sql语句，传到数据库处理
            int row = preparedStatement.executeUpdate();
            //如果添加成功返回true
            if (row > 0){
                return true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭数据库,有力往外关闭
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        //要求用户输入
        Scanner scanner = new Scanner(System.in);
        //实例化狗类
        Dog dog = new Dog();
        System.out.println("请输入你要的操作：1、增加 2、修改3、删除 4、查");
        int num = scanner.nextInt();
        //根据不同操作选择不同的功能
        switch (num){
            //增加
            case 1:
                System.out.print("请输入狗的姓名");
                String name = scanner.next();
                System.out.println("请输入狗的健康值：");
                int health = scanner.nextInt();
                System.out.println("请输入狗的亲密度：");
                int love = scanner.nextInt();
                System.out.println("请输入狗的品种:");
                String strain = scanner.next();
                //向Dog类里面传值
                dog.setName(name);
                dog.setHealth(health);
                dog.setLove(love);
                dog.setStrain(strain);
                //调用添加的方法
                Boolean flag = insert(dog);
                if (flag == true)
                    System.out.println("添加成功");
                else
                    System.err.println("失败");
                break;
            //修改的方法
            case 2:
                System.out.println("你要修改狗的id");
                int id = scanner.nextInt();
                System.out.print("请输入狗的新姓名");
                String newname = scanner.next();
                //传值
                dog.setId(id);
                dog.setName(newname);
                //调用修改方法
                Boolean flag1 = alter(dog);
                if (flag1 == true)
                    System.out.println("修改成功");
                else
                    System.err.println("失败");
                break;
        }
    }
}