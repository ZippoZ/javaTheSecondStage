package homework20160705;

/**
 * Created by Zippo on 2016/7/5.
 *创建一个抽象的宠物的父类里面有三个属性分别是宠物的名字、宠物的健康值和宠物的亲密度。
 * 同时我们定义几个抽象的方法，来帮助我们事先用户的需求
 */
public abstract class Pet {
    private String name;
    private int love;
    private int hunger;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
    public abstract void feed();
}
