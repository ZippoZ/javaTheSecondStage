package examination6;

import java.util.Random;

/**
 * Created by Zippo on 2016/7/11.
 */
public class RandomMath {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[100];
        int min = 99;
        int max = 0;
        int count = 0;
        for (int i=0;i<num.length;i++){
            num[i] = random.nextInt(99);
            if (min > num[i]){
                min = num[i];
            }
            if (max < num[i]){
                max = num[i];
            }
            if (num[i] > 50){
                count++;
            }
        }
        System.out.println("最小值为"+min);
        System.out.println("最大值为"+max);
        System.out.println("大于50出现的次数"+count);
    }
}
