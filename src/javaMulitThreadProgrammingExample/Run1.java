package javaMulitThreadProgrammingExample;

/**
 * Created by Zippo on 2016/7/18.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread a = new Thread(myThread1,"a");
        Thread b = new Thread(myThread1,"b");
        Thread c = new Thread(myThread1,"c");
        Thread d = new Thread(myThread1,"d");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
