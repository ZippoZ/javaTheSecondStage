package javaMulitThreadProgrammingExample;

/**
 * Created by Zippo on 2016/7/19.
 */

public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <5000; i++){
            System.out.println("i="+(i+1));
        }
    }
}