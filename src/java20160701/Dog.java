package java20160701;

/**
 * Created by Zippo on 2016/7/1.
 */
public class Dog {

    private String name;
    private int love;
    private int health;
    private String strain;

    /***
     * 获取name的值
     * @return name的值
     */
    public String getName() {
        return name;
    }

    /***
     * 对那么进行赋值
     * @param name 传回来的狗的名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * 获取狗狗的亲密度
     * @return 狗狗的亲密度
     */
    public int getLove() {
        return love;
    }

    /***
     * 对狗狗的亲密度进行赋值
     * @param love 返回狗狗的亲密度
     */
    public void setLove(int love) {
        if (love>=0 && love<= 100){
        this.love = love;
        }else {
            this.love = 40;
            System.err.println("亲密度输入有误！！！默认为40");
        }
    }

    /***
     * 获取狗狗的健康值
     * @return 狗狗的健康值
     */
    public int getHealth() {
        return health;
    }

    /***
     * 对狗狗的健康值进行赋值
     * @param health 返回来的狗狗的健康的值
     */
    public void setHealth(int health) {
        if (health>=0 && health<= 100){
            this.health = health;
        }else {
            this.health = 40;
            System.err.println("健康值输入有误！！！默认为40");
        }
    }

    /***
     * 获取狗品种
     * @return 狗品种
     */
    public String getStrain() {
        return strain;
    }

    /***
     * 给狗的品种进行赋值
     * @param strain 用户输入的狗的品种
     */
    public void setStrain(String strain) {
        if ("聪明的拉布拉多犬".equals(strain)||"酷酷的雪纳瑞".equals(strain)) {
            this.strain = strain;

        }else {
            this.strain = "聪明的拉布拉多犬";
            System.err.println("输入有误！！！！默认为聪明的拉布拉多犬");
        }
    }
    public String toString(){
        return "宠物自白：\n我的名字加"+name+"我的健康值为"+health+"我和主人的亲密度为"+love+"我的类型为"+strain;
    }
}
