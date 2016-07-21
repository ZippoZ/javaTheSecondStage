package jianShuJavaExample;

import java.util.Scanner;

/**
 * Created by Zippo on 2016/7/3.
 * 我们创建一个小学生的都列问题，来了一个转校生我们要给她安排在一个位置上
 */
public class StringBufferExample {
    //定义一个字符串我们来存储这个队列
    String queue = "小红，小花，小白，小羽，小小";
    int index;
    /***
     * 定义方法去寻找用户输入的那位同学
     * @param str 用户输入的同学
     */
    StringBufferExample(String str){
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer str1 = stringBuffer.insert(queue.indexOf(str),",小明");
        System.out.println(queue);
    }

    /***
     * 定义一个插入的方法
     */

    /***
     * 我们来测试这个我们写的这个类
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入小明要在那位同学的后面？？？");
        String str = scanner.next();
        StringBufferExample s = new StringBufferExample(str);
    }
}
