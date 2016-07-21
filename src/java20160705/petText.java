package java20160705;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/5.
 */
public class petText {
    public static void main(String[] args) {
        Master master = new Master();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入宠物的品种：");
        String str = scanner.next();
        System.out.print("请输入宠物的姓名：");
        String name = scanner.next();
        System.out.print("请输入"+name+"的健康值：（0--100）");
        int he = scanner.nextInt();

        int love  = scanner.nextInt();
        if ("狗狗".equals(str)){
        }else if ("企鹅".equals(str)){
            System.out.print("请输入"+name+"的性别：");
            String sex = scanner.next();
            Penguin penguin = new Penguin();
            master.cure(penguin);
        }
    }
}
