package jdbc.jdbc20160719;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/19.
 */
public class Pet {
    static final String url ="jdbc:oracle:thin:@//localhost:1521/orcl";
    static final String userName = "system";
    static final String powerWord = "12345678";
    static final String dirver = "oracle.jdbc.OracleDriver";
    /**
     * 对数据库的链接等封装
     */
    private static void Conn(String sql){
        Connection connection =null;
        Statement statement =null;
        ResultSet resultSet = null;
        try {
            Class.forName(dirver);
            //DriverManager对象的getConnection与数据库建立连接
            connection = DriverManager.getConnection(url,userName,powerWord);
            //通过statement对sql操作
            statement = connection.createStatement();
            if (sql.contains("select")){
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int health = resultSet.getInt(3);
                    int love = resultSet.getInt(4);
                    String strain = resultSet.getString(5);
                    System.out.println(id + "\t" + name + "\t" + health + "\t" + love + "\t" + strain);
                }
            }else {
                int row = statement.executeUpdate(sql);
                if (row > 0){
                    System.out.println("操作成功");
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
           close(connection,statement,resultSet);
        }
    }
    /**
     * 关闭服务
     * @param connection connection对象
     * @param statement statement 对象
     */
    private static void close(Connection connection,Statement statement,ResultSet resultSet){
        try{
            if (statement!=null) {
                statement.close();
            }
            if (connection!=null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加信息
     * @param name 宠物名字
     * @param health 健康值
     * @param love 亲密度
     * @param strain 品种
     */
    public static void add(String name,int health,int love,String strain){
        String sql = String.format("INSERT INTO t_Pet(id,name,health,love,strain) VALUES (seq_t_Pet.nextval,'%s','%d','%d','%s')",name,health,love,strain);
         Conn(sql);
        select();
    }
    public static void delete(String name){
        String sql = String.format("DELETE t_Pet WHERE name='%s'",name);
        Conn(sql);
        select();
    }
    public  static void alter(String name,String newName){
        String sql =String.format("UPDATE  t_master SET name = '%s' WHERE name = '%s'", newName,name);
        Conn(sql);
        select();
    }
    public static  void select(){
        String sql = "select * FROM t_Pet";
        Conn(sql);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********欢迎来到宠物管理系统***********");
        System.out.print("请选择你要进行的操作：1、添加一个宠物，2、删除宠物 3、修改宠物信息 4、查询动物信息：");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.print("请输入宠物的昵称：");
                String name = scanner.next();
                System.out.print("请输入宠物的初始的健康值：");
                int health = scanner.nextInt();
                System.out.print("请输入宠物的初始的亲密度：");
                int love = scanner.nextInt();
                System.out.print("请输入宠物的品种：");
                String strian = scanner.next();
                add(name,health,love,strian);
                break;
            case 2:
                System.out.print("请输入宠物的昵称：");
                String name1 = scanner.next();
                delete(name1);
                break;
            case 3:
                System.out.print("请输入宠物的昵称：");
                String name2 = scanner.next();
                System.out.print("请输入宠物的昵称：");
                String newName3 = scanner.next();
                alter(name2,newName3);

        }
    }
}
