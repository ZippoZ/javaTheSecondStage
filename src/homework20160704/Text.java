package homework20160704;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/4.
 */
public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name = scanner.next();
        System.out.print("请输入你的年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入你的身高：");
        float height = scanner.nextFloat();
        System.out.print("请输入你的体重：");
        float weight = scanner.nextFloat();
        System.out.print("请输入你的工作：");
        String job = scanner.next();
        if ("中医".equals(job)||"西医".equals(job)){
            Doctor doctor = new Doctor(name,age,height,weight,job);
            doctor.print1();
            doctor.print();
        }else if ("老师".equals(job)){
            Teacher teacher = new Teacher(name,age,height,weight,job);
            teacher.print1();
            teacher.print();
        }else if ("程序员".equals(job)){
            Programmer programmer = new Programmer(name,age,height,weight,job);
            programmer.print1();
            programmer.print();
        }else {
            System.err.println("输入有误");
        }
    }
}
