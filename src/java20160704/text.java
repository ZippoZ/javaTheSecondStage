package java20160704;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/4.
 */
public class text {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Peigui peigui = new Peigui();
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到宠物店");
        /**
         * 用户输入所要领养的宠物的姓名
         */
        System.out.print("请输入宠物的姓名：");
        String name = scanner.next();
        System.out.print("请选择你要选择的领养宠物的类型：（1、狗狗2、企鹅）");
        int num = scanner.nextInt();
        String strain;
        switch (num) {
            case 1:
                /**
                 * 用户输入所要领养的狗狗的品种
                 */
                System.out.print("请输入狗狗的品种：（1、聪明的拉布拉多犬 2、酷酷的雪纳瑞）");
                int num1 = scanner.nextInt();
                switch (num1) {
                    case 1:
                        strain = "聪明的拉布拉多犬";
                        break;
                    case 2:
                        strain = "酷酷的雪纳瑞";
                        break;
                    default:
                        strain = "雪纳瑞";
                        break;
                }
                System.out.print("请输入狗狗的健康值：（0--100）");
                int he = scanner.nextInt();
                System.out.print("请输入狗狗的请密度");
                int love = scanner.nextInt();
                dog.setName(name);
                dog.setStrain(strain);
                dog.setHealth(he);
                dog.setLove(love);
                dog.print(name,he,love);
                break;
            case 2:
                System.out.print("请输入企鹅的健康值：（0--100）");
                he = scanner.nextInt();
                System.out.print("请输入企鹅的请密度");
                love = scanner.nextInt();
                System.out.print("请输入企鹅的品种：（1、Q仔 2、Q妹）");
                int num2 = scanner.nextInt();
                String sex;
                switch (num2) {
                    case 1:
                        sex = "Q仔";
                        break;
                    case 2:
                        sex = "Q妹";
                        break;
                    default:
                        sex = "Q仔";
                        break;
                }
                peigui.setName(name);
                peigui.setSex(sex);
                peigui.setHealth(he);
                peigui.setLove(love);
                peigui.print(name,he,love);
                break;
            default:
                System.err.println("输入有误！！！");
        }
    }
}
