package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 */
public class Bus extends MotoVehile{
    private  int  seatCount;//座位数
    /***
     * 定义一个父类的构造方法
     * @param seatCount 座位数
     * @param no 车牌号
     */
    public Bus(String no,int seatCount) {
        super(no);
        this.seatCount = seatCount;
    }

    /***
     * 获取座位数
     * @return 座位数
     */
    public int getSeatCount() {
        return seatCount;
    }

    /***
     * 设置座位数
     * @param seatCount 座位数
     */
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    /***
     * 用来计算总价的 单价 * 天数
     *
     */
    @Override
    public float Sun() {
        if (seatCount < 0)
            System.err.print("输入有误");
        if (seatCount <= 16)
            this.setPrice(800);
        else
            this.setPrice(1500);
        return getPrice() * getDays();
    }
    /***
     * 输出信息
     */
    @Override
    public void print() {
        System.out.println("您租了座位数"+seatCount+"车牌号是"+getNo()+"您要租用"+getDays()+"天，您每天需要花费"+getPrice());
    }
}
