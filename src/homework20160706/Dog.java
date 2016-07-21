package homework20160706;

/**
 * Created by Zippo on 2016/7/6.
 */
public class Dog implements IDog {
    private String name;
    private  int health;
    private  int love;

    /***
     * 如果主人和狗玩了接飞盘的游戏话健康值下降5；
     * 亲密度上升5，如果亲密度是100则不上升
     * @param play 是否玩游戏
     */
    @Override
    public void frisbee(boolean play) {
        if (play==true){
            if(health <= 50){
                System.err.println("主人我现在好饿啊!不能好好的玩耍！");
            }else {
                if (love<100)
                    love += 5;
                else
                    love=100;
                System.out.println("我现在正在接飞盘游戏！我的健康值是" + (health-5) +"我和主人的亲密度"+love);
            }
        }
    }
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }

    @Override
    public int heaith(int health) {
        this.health = health;
        return health;
    }

    @Override
    public int love(int love) {
        this.love = love;
        return love;
    }

    @Override
    public void speak() {
        System.out.println("大家好！我叫"+name);
    }

    @Override
    public void eat() {
       health  =   health+ 10;
        System.out.println("主人好棒啊！又给我喂狗粮我的健康值回来了"+health);
    }
}
