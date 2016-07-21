package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 */
public class Car extends MotoVehile {
    private  String type;

    /***
     * 定义一个父类的构造方法
     * @param type  车型
     * @param no    车牌号
     *
     */
    public Car(String no,String type) {
        super(no);
        this.type = type;
    }

    /***
     * 用来计算总价的 单价 * 天数
     */
    @Override
    public float Sun() {
        if ("别克商务舱GL8".equals(type))
            setPrice(600);
        if ("宝马550i".equals(type))
            setPrice(500);
        if ("别克林荫大道".equals(type))
            setPrice(300);
        return getDays() * getPrice();
    }

    /***
     * 输出信息
     */
    @Override
    public void print() {
        System.out.println("您租了"+type+"车牌号是"+getNo()+"您要租用"+getDays()+"天，您每天需要花费"+getPrice());
    }
}
