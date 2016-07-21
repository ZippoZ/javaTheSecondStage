package java20160630;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/30.
 */
public class LoginText {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Login login = new Login();
        while (true){
            System.out.print("请输入用户名：");
            String name = scanner.next();
            login.user(name);
            System.out.print("请输入密码：");
            String psd1 = scanner.next();
            login.Psd1(psd1);
            System.out.print("请重新输入密码：");
            String psd2 = scanner.next();
            login.psd2(psd2);
            boolean flag= login.pan(name,psd1,psd2);
            if (flag){
                break;
            }
        }
    }
}
