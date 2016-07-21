package javaMulitThreadProgrammingExample;

/**
 * Created by Zippo on 2016/7/19.
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            MyThread2 myThread2 = new MyThread2();
            myThread2.start();
            myThread2.sleep(2000);
            myThread2.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
