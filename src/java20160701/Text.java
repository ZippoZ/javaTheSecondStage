package java20160701;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/1.
 */
public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * 对dog这个类实例化对象
         */
        Dog dog = new Dog();
        /**
         * 对penguin这个类实例化对象
         */
        Penguin penguin = new Penguin();
        System.out.println("欢迎来到宠物店");
        /**
         * 用户输入所要领养的宠物的姓名
         */
        System.out.print("请输入宠物的姓名：");
        String name = scanner.next();
        /**
         * 用户输入所要领养的宠物类型
         */
        System.out.print("请选择你要选择的领养宠物的类型：（1、狗狗2、企鹅）");
        int num = scanner.nextInt();
        String strain;
        /***
         * 对num进行判断，如果num为1的话则选择狗狗的领养
         * 如果为2的话则选择企鹅的领养
         * 如果为其他则我们输出用户输入有误！！系统默认退出；
         */
        switch (num){
            case 1:
                /**
                 * 用户输入所要领养的狗狗的品种
                 */
                System.out.print("请输入狗狗的品种：（1、聪明的拉布拉多犬 2、酷酷的雪纳瑞）");
                int num1 = scanner.nextInt();
                /***
                 * 对狗狗的品种进行选择 如果为1的话则选择聪明的拉布拉多犬；
                 * 如果为2的话则选择酷酷的雪纳瑞；
                 * 如果为其他的话我们则输出用户输入有误！系统默认选择聪明的拉布拉多犬。
                 */
                switch (num1){
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
                /**
                 * 用户输入所要领养的狗狗的健康值
                 */
                System.out.print("请输入狗狗的健康值：（0--100）");
                int he = scanner.nextInt();
                /**
                 * 用户输入所要领养的狗狗的亲密度
                 */
                System.out.print("请输入狗狗的请密度");
                int love = scanner.nextInt();
                /**
                 * 向我们封装的dog类里面传值
                 */
                dog.setName(name);
                dog.setStrain(strain);
                dog.setHealth(he);
                dog.setLove(love);
                /**
                 * 输出dog
                 * System.out.println 默认调用dog类里面的toString方法
                 */
                System.out.println(dog);
                break;
            case 2:
                /**
                 * 用户输入企鹅的健康值
                 */
                System.out.print("请输入企鹅的健康值：（0--100）");
                he = scanner.nextInt();
                /**
                 * 用户输入的企鹅的亲密度
                 */
                System.out.print("请输入企鹅的请密度");
                love = scanner.nextInt();
                /**
                 * 向企鹅类里面的传值
                 */
                penguin.setName(name);
                penguin.setLove(love);
                penguin.setHealth(he);
                /**
                 * 输出penguin
                 * System.out.println 默认调用dog类里面的toString方法
                 */
                System.out.println(penguin);
                break;
            default:
                System.err.println("输入有误！！！！");
                break;
        }
    }
}
