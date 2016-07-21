package java20160630;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/30.
 */
public class StringYOuxian {
    /***
     * 邮箱
     */
    String you;

    /***
     *
     * @param name 返回用户输入的邮箱名
     */
    void yan(String name){
        this.you =name;
        int ext = you.lastIndexOf("@");
        int exd = you.lastIndexOf(".");
        String str = you.substring(exd);
        /***
         * 判断@的位置
         */
        if (ext > 4){
            /***
             * 判断@的位置在.的前面
             */
            if (ext < exd){
                /***
                 * 判断@与.之间的字符个数
                 */
                if (exd - ext > 2){
                    /***
                     * 判断.到最后的字符之间的字符是否是.com或.cn
                     */
                    if (".com".equals(str)||".cn".equals(str)){
                        System.out.println("是邮箱");
                    }else {
                        System.err.println("不是邮箱");
                    }
                }else {
                    System.err.println("不是邮箱");
                }
            }else {
                System.err.println("不是邮箱");
            }
        }else {
            System.err.println("不是邮箱");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringYOuxian stringYOuxian = new StringYOuxian();
        System.out.println("请输入邮箱：");
        String name = sc.next();
        stringYOuxian.yan(name);
    }
}
