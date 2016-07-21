package javaMulitThreadProgrammingExample;

/**
 * Created by Zippo on 2016/7/18.
 */
public class MyThread extends Thread{
    private int count = 5;
    public MyThread(String name){
        super();
        this.setName(name);//设置线程的名称
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("有"+this.currentThread().getName()+"计算，count="+count);
        }
    }
}
