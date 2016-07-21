package java20160706;

/**
 * Created by Zippo on 2016/7/6.
 * 创建一个抽象的机动车类。定义抽次那个方法
 */
public abstract class MotoVehile {
    private String no;//车牌号
    private float price;//价钱
    private  float days;//天数

    /***
     * 获取车牌号
     * @return 车牌号
     */
    public String getNo() {
        return no;
    }

    /***
     *设置车牌号
     * @param no 车牌号
     */
    public void setNo(String no) {
        this.no = no;
    }

    /***
     * 获取价格
     * @return 价格
     */
    public float getPrice() {
        return price;
    }

    /***
     * 设置价格
     * @param price 价格
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /***
     * 获取天数
     * @return 天数
     */
    public float getDays() {
        return days;
    }

    /***
     * 设置天数
     * @param days 天数
     */
    public void setDays(float days) {
        this.days = days;
    }

    /***
     * 定义一个父类的构造方法
     * @param no 车牌号
     */
    public MotoVehile(String no){
        this.no = no;
    }
    public abstract float Sun();
    public  abstract  void print();
}
