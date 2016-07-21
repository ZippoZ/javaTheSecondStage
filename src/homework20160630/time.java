package homework20160630;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/30.
 * 输入一个字符串，输入一个字符，判断给字符在该字符串中出现的次数。
 */
public class time {
    /***
     * @param str 返回输入的字符串
     * @param ch 返回要查找的字符
     */
    int i=0;
    boolean flag = false;
    public void find(String str,String ch){
       while (true){
           if (str.indexOf(ch) != -1){
               char[] chars =str.toCharArray();
               for (int j =0;j<chars.length;j++){
                   if (ch.equals(chars[i])){
                       chars[i]='0';
                       this.i = i++;
                   }
               }
           }else {
               break;
           }
           System.out.println(str +"包含"+i+"个"+ch);
       }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time t = new time();
        System.out.print("输入字符串：");
        String str = sc.next();
        System.out.print("输入你要查找的字符：");
        String st = sc.next();
        t.find(str,st);
    }
}
