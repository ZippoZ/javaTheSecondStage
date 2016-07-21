package homework20160629;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/29.
 */
public class StudentText {
    Student[] stu = new Student[5];
    int i = 0;

    /***
     *接受用户输入的学生姓名和年龄
     * @param student 从主方法中传入的值
     */
    void SortJS(Student student){
        stu[i++] = student;
    }

    /***
     *
     * @param stu
     * @return 学生数组
     */
    Student[] Sort(Student[] stu){
        System.out.println("姓名\t年龄");
        for (int j=0;j<stu.length-1;j++){
            for (int z = 0;z<stu.length-1;z++){
                if (stu[j].age < stu[i+1].age){
                    int temp = stu[i].age;
                    stu[i].age = stu[i+1].age;
                    stu[i+1].age = temp;
                }

            }
        }
        return stu;
    }

    /***
     *
     * @return 学生数组
     */
    Student[] show(){
        System.out.println("姓名\t年龄");
        for (int j=0;j<stu.length-1;j++){
            System.out.println(stu[j].name+"\t"+stu[i].age);
        }
        return stu;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentText studentText = new StudentText();
        for (int i =0;i<studentText.stu.length;i++){
            Student student =new Student();
            System.out.print("");
        }
    }
}
