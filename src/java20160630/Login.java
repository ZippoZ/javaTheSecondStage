package java20160630;

/**
 * Created by Zippo on 2016/6/30.
 * 创建一个登入系统，用户名的长度不少于3个字符，密码长度不少于6个
 * 注册需要输入两次密码，两次密码要一致。
 */
public class Login {
    String userName;
    String psd1;
    String psd2;
    boolean flag;
    /***
     *
     * @param name 接收用户输入的用户名
     */
    void user(String name){
        this.userName = name;
    }

    /***
     *
     * @param psdFri 接收用户输入第一次密码
     */
    void Psd1(String psdFri){
        this.psd1 = psdFri;
    }

    /***
     *
     * @param psdScr 接收用户输入的第二次密码
     */
    void psd2(String psdScr){
        this.psd2 = psdScr;
    }

    /***
     *
     * @param name 判断用户名的长度
     * @param psd1 判断密码的长度
     * @param psd2 判断两次输入的密码是否一致
     */
    boolean pan(String name, String psd1,String psd2){
        if (name.length() > 3){
            if (psd1.length()>6&&psd2.length()>6) {
                if (psd1.equals(psd2)) {
                    System.out.println("注册成功！！！");
                    return flag = true;
                } else {
                    System.err.println("两次输入的密码不一致！！！");
                    return flag = false;
                }
            }else {
                System.err.println("密码输入的太短！！！");
                return flag = false;
            }
        }else{
            System.out.println("用户名太短！！！");
            return flag = false;
        }
    }
}
