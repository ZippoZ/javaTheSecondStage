package java20160701;

import java.util.logging.Logger;

/**
 * Created by Zippo on 2016/7/1.
 * 瀵逛紒楣呯被杩涜灏佽
 */
public class Penguin {
   Logger logger =Logger.getLogger(String.valueOf(this.getClass()));
    /**
     * name 宠物的姓名
     * love 宠物的的亲密度
     * health 宠物的健康值
     */
    private String name;
    private int love;
    private int health;

    /***
     * 获取企鹅的名字
     * @return 企鹅的名字
     */
    public String getName() {
        return name;
    }

    /***
     * 对企鹅的名字进行赋值
     * @param name 传回用户输入的企鹅的名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * 获取企鹅的亲密度
     * @return 企鹅的亲密度
     */
    public int getLove() {
        return love;
    }

    /***
     * 对企鹅的亲密度赋值
     * @param love 用户输入的企鹅的亲密度
     */
    public void setLove(int love) {
        if (love>=0 && love<= 100){
            this.love = love;
        }else {
            this.love = 40;
            System.err.println(" 亲密度输入有误！！！默认为40");
        }
    }

    /***
     * 获取企鹅的健康值
     * @return  企鹅的健康值
     */
    public int getHealth() {
        return health;
    }

    /***
     * 对企鹅的健康值进行赋值
     * @param health 放回用户输入的企鹅的健康值
     */
    public void setHealth(int health) {
        if (health>=0 && health<= 100){
            this.health = health;
        }else {
            this.health = 40;
            System.err.println("健康值输入有误！！！默认为40");
        }
    }
    public String toString() {
        return  "宠物自白：\n我的名字加" + name + "我的健康值为" + health + "我和主人的亲密度为" + love;
    }

}
