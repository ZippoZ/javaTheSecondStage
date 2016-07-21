package java20160706;

import java20160705.*;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/6.
 */
public class Text {
    public static void main(String[] args) {
        Customer customer = new Customer();
        MotoVehile[] motoVehiles = new MotoVehile[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i<motoVehiles.length) {
            System.out.println("*******欢迎计入汽车租赁系统*******");
            System.out.print("请输入你要租车的类型：(1、客车2、轿车)");
            int num = sc.nextInt();
            System.out.print("请输入你要租车的车牌号：");
            String no = sc.next();
            if (num == 1) {
                System.out.print("请输入你要租车的座位数：");
                int seatCount = sc.nextInt();
                System.out.print("请输入你要租车的天数：");
                float days = sc.nextFloat();
                Bus bus = new Bus(no, seatCount);
                bus.setDays(days);
                motoVehiles[i] = bus;
            } else if (num == 2) {
                System.out.print("请输入你要租车的车型");
                String type = sc.next();
                System.out.print("请输入你要租车的天数：");
                float days = sc.nextFloat();
                Car car = new Car(no, type);
                car.setDays(days);
                motoVehiles[i] = car;
            }
            i=i++;
            System.out.println("是否还要租车？？？（1、继续 2、结束）");
            int num2 = sc.nextInt();
            if (num2 == 1){
                customer.rent(motoVehiles);
                continue;
            }else if (num2 == 2){
                customer.rent(motoVehiles);
                break;
            }else {
                System.err.println("输入有误！！！");
                break;
            }
        }
    }
}
