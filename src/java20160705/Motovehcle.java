package java20160705;

/**
 * Created by Zippo on 2016/7/5.
 * 创建一个机动车的类
 */
public abstract class Motovehcle {
    private String no;//车牌号
    private String brand;//品牌
    private String color;//颜色
    private float mileage;//里程数

    /***
     * 创建一个有参构造方法
     * @param no 车牌号
     * @param brand 品牌
     * @param color 颜色
     * @param mileage 里程数
     */
    public Motovehcle(String no, String brand, String color,float mileage){
        this.no = no;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }
    public String getNo() {
        return no;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public float getMileage() {
        return mileage;
    }
    public abstract float result(float days);
    public abstract void print(float days);
}
