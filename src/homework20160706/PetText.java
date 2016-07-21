package homework20160706;

import java20160705.*;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/6.
 */
public class PetText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入宠物的名字：");
        String name = sc.next();
        System.out.println("请输入宠物的健康值：");
        int health = sc.nextInt();
        System.out.println("请输入宠物和主人的亲密度：");
        int love = sc.nextInt();
        System.out.print("请选择你要选择的宠物：（1、狗狗 2、企鹅）");
        int num = sc.nextInt();
        Dog dog = new Dog();
        dog.heaith(health);
        dog.name(name);
        dog.love(love);
        Penguin penguin = new Penguin();
        penguin.heaith(health);
        penguin.love(love);
        penguin.name(name);
        if (num == 1){
        while (true){
                System.out.print("请选择你要狗狗干嘛？？（1、打招呼 2、玩游戏 3、喂食）");
                int num2 = sc.nextInt();
                if (num2 == 1){
                    dog.speak();
                }else if (num2 == 2){
                    dog.frisbee(true);
                }else if (num2 == 3){
                    dog.eat();
                }else {
                    System.err.println("输入有误！！！");
                    break;
                }
            System.out.print("是否继续");
                String str = sc.next();
                if ("否".equals(str)){
                break;
                }
            }
        } else if (num == 2){
            while (true){
                System.out.print("请选择你要狗狗干嘛？？（1、打招呼 2、玩游戏 3、喂食）");
                int num2 = sc.nextInt();
                if (num2 == 1){
                    penguin.speak();
                }else if (num2 == 2){
                    penguin.swim(true);
                }else if (num2 == 3){
                    penguin.eat();
                }else {
                    System.err.println("输入有误！！！");
                    break;
                }
                System.out.print("是否继续");
                String str = sc.next();
                if ("否".equals(str)){
                    break;
                }
            }
        }
    }
}
