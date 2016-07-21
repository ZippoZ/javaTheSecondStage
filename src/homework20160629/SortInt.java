package homework20160629;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/6/29.
 */
public class SortInt {
    SortIntLine[] num = new SortIntLine[5];
    int a = 0;
    void sort(SortIntLine n){
        num[a++] = n;
    }
    void show(){
        System.out.println("排序前：");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i].num+"\t");
        }
    }
    void showSort(){
        System.out.println("\n排序后：");
        for (int i=0;i<num.length-1;i++){
            for (int j =0;j<num.length-1;j++){
                if (num[i].num < num[i+1].num){
                    int temp = num[i].num;
                    num[i].num = num[i+1].num;
                    num[i+1].num = temp;
                }
            }
            System.out.print(num[i].num+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        SortInt sortInt =new SortInt();
        for (int i=0;i<sortInt.num.length;i++){
            SortIntLine sortIntLine = new SortIntLine();
            System.out.print("请输入第"+(i+1)+"个数：");
            sortIntLine.num =scanner.nextInt();
            sortInt.sort(sortIntLine);
        }
        sortInt.show();
        sortInt.showSort();
    }
}
