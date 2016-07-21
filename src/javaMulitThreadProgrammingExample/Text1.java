package javaMulitThreadProgrammingExample;

/**
 * Created by Zippo on 2016/7/19.
 */
public class Text1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+" "+thread.getId());
    }
}
