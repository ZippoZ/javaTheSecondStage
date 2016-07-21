package java20160705;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Bus extends Motovehcle {
    private int seatCount;
    /***
     * 创建一个有参构造方法
     *
     * @param no      车牌号
     * @param brand   品牌
     * @param color   颜色
     * @param mileage 里程数
     */
    public Bus(String no, String brand, String color, float mileage,int seatCount) {
        super(no, brand, color, mileage);
        this.seatCount = seatCount;
    }

    @Override
    public float result(float days) {
        int price = 0;
        if (seatCount < 0)
            System.err.print("输入有误");
        if (seatCount <= 16)
            price = 800;
        else
            price = 1500;
        return price * days;
    }

    @Override
    public void print(float days) {
        System.out.println("您租的车品牌是："+getBrand()+"座位数为："+seatCount+"车牌号为："+getNo()+
                "车的颜色为"+getColor()+"车的里程数为："+getMileage()+"租用天数为："+days+"费用为："+result(days));
    }
}
