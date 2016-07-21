package javaMulitThreadProgrammingExample;

/**
 * Created by Zippo on 2016/7/18.
 */
public class MyThread1 extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("有"+this.currentThread().getName()+"计算，count="+count);
    }
}
