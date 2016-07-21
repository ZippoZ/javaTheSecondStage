package java20160705;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******欢迎计入汽车租赁系统*******");
        System.out.print("请输入你要租车的类型：(1、客车2、轿车)");
        int num = sc.nextInt();
        System.out.print("请输入你租车的品牌：");
        String brand = sc.next();
        System.out.print("请输入你要租车的车牌号：");
        String no = sc.next();
        System.out.print("请输入你要租车的颜色：");
        String color = sc.next();
        System.out.print("请输入你要租车的里程数：");
        float mileage = sc.nextFloat();
        if (num == 1){
            System.out.print("请输入你要租车的座位数：");
            int seatCount = sc.nextInt();
            System.out.print("请输入你要租车的天数：");
            float days = sc.nextFloat();
            Bus bus = new Bus(no,brand,color,mileage,seatCount);
            bus.result(days);
            bus.print(days);
        }else if (num == 2){
            System.out.print("请输入你要租车的车型");
            String type = sc.next();
            System.out.print("请输入你要租车的天数：");
            float days = sc.nextFloat();
            Car car = new Car(no,brand,color,mileage,type);
            car.result(days);
            car.print(days);
        }else {
            System.err.println("输入有误");
        }

    }
}
