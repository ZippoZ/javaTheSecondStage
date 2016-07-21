package javaThinking.tools;

/**
 * Created by Zippo on 2016/6/29.
 * 创建一个输出类以便减少或者完全消除重复代码
 */
public class P {
    /***
     *
     * @param obj 传入的是一个object类型的值
     */
    public static void rint(Object obj){
        System.out.println(obj);
    }

    /***
     *
     * @param s 传入的是一个String类型的值
     */
    public static void rint(String s){
        System.out.println(s);
    }

    /***
     *
     * @param s 传入的是一个char类型的数组
     */
    public static void rint(char[] s){
        System.out.println(s);
    }

    /***
     *
     * @param i 传入的是一个int类型的值
     */
    public static void rint(int i){
        System.out.println(i);
    }

    /***
     *
     * @param l 传入的是一个long类型的值
     */
    public static  void rint(long l){
        System.out.println(l);
    }

    /***
     *
     * @param f 传入的是一个float的值
     */
    public static void rint(float f){
        System.out.println(f);
    }

    /***
     *
     * @param d 传入一个double的值
     */
    public static void rint(double d){
        System.out.println(d);
    }

    /***
     *
     * @param b 传入一个Boolean的值
     */
    public static  void rint(boolean b){
        System.out.println(b);
    }
}
