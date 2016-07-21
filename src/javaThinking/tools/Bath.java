package javaThinking.tools;

/**
 * Created by Zippo on 2016/6/30.
 * 在对象定义的时候开始初始化，--就是在构造函数之前就得到初始化
 * 如果不在对象定义的时候初始化，仍然不能保证能将一条消息发给一个对象之前会执行初始化操作
 * 除非出现不可违例的的异常存在
 */
class Soap {
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = new String("Constructed");
    }
    public String toString(){
        return s;
    }
}
public class Bath {
    /***
     * 初始化点的定义
     */
    private String s1 =new String("happy!!"),
    s2 ="happy",s3, s4;
    Soap castille;
    int i;
    float toy;
    Bath(){
        System.out.println("Inside Bath()");
        s3 = new String("joy");
        i = 47;
        toy = 3.14f;
    }

    /***
     * 延迟初始化
     */
    void print(){
        if (s4 == null){
            s4 = new String("joy");
            }
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("s3 = "+s3);
        System.out.println("s4 = "+s4);
        System.out.println("toy = "+toy);
        System.out.println("castille = "+castille);
    }

    public static void main(String[] args) {
        Bath b =new Bath();
        b.print();
    }
}
