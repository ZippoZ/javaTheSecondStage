package examination6;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/11.
 *"A"和"a"出现的次数
 */
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入文件名：");
        String str = scanner.next();
        String str1 = str.replaceAll("a","");
        String str2 = str1.replaceAll("A","");
        int count = str.length() - str2.length();
        System.out.println("文件中A和a一共出现的次数为："+count);
    }
}
