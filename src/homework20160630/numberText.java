package homework20160630;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/30.
 */
public class numberText {


    /***
     * 用来接收用户输入的值
     * @param n 传递过来的是一个数组的地址
     */
    boolean verify(String n,String c, String j){
        if (n.length() == 16 || n.length() == 18){
            if (c.length() == 11){
                if (j.indexOf('-') == 4){
                    System.out.println("都输入成功！！");
                    return true;
                }else{
                    System.err.println("输入的固话号码区号必须是是4位字符！！！");
                    return false;
                }
            }else {
                System.err.println("输入的手机号码必须是11位字符！！！");
                return false;
            }
        }else{
            System.err.println("输入的身份证号码必须是16位的字符或18位的字符！！！");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        numberText nu = new numberText();
        while (true){
            System.out.print("请输入身份证号码：");
            String identityCard = scanner.next();
            System.out.print("请输入手机号码：");
            String MobileNo = scanner.next();
            System.out.print("请输入固话号码：");
            String fixPhoneNo = scanner.next();
            boolean flag = nu.verify(identityCard,MobileNo,fixPhoneNo);
            if (flag){
                break;
            }
        }
    }
}
