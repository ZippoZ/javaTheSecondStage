package java20160704;

/**
 * Created by Zippo on 2016/7/4.
 * 创建一个抽象的宠物类
 */
public abstract class Pet {
    private String name;
    private int love;
    private int health;
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
    public abstract void print(String name,int health,int love);
}
