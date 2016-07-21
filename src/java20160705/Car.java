package java20160705;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Car extends Motovehcle {
    private String type;
    /***
     * 创建一个有参构造方法
     *
     * @param no      车牌号
     * @param brand   品牌
     * @param color   颜色
     * @param mileage 里程数
     */
    public Car(String no, String brand, String color, float mileage,String type) {
        super(no, brand, color, mileage);
        this.type = type;
    }

    @Override
    public float result(float days) {
        float price = 0;
        if ("别克商务舱GL8".equals(type))
            price = 600;
        if ("宝马550i".equals(type))
            price = 500;
        if ("别克林荫大道".equals(type))
            price = 300;
        return price * days;
    }

    @Override
    public void print(float days) {
        System.out.println("您租的车品牌是："+getBrand()+"车型为："+type+"车牌号为："+getNo()+
        "车的颜色为"+getColor()+"车的里程数为："+getMileage()+"租用天数为："+days+"费用为："+result(days));
    }
}
