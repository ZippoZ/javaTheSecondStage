package homework20160702;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/2.
 */
public class Text {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入人的姓名：");
        String name = scanner.next();
        System.out.print("请输入人的性别：");
        String sex = scanner.next();
        System.out.println("请输入人的年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入人的身高：");
        float height = scanner.nextFloat();
        System.out.print("请输入人的体重：");
        float weight = scanner.nextFloat();
        person.setName(name);
        person.setSex(sex);
        person.setAge(age);
        person.setHeight(height);
        person.setWeight(weight);
        System.out.println(person);

    }
}
