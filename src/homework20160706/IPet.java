package homework20160706;

/**
 * Created by Zippo on 2016/7/6.
 * 创建一个宠物接口
 */
public interface IPet {
    /***
     * 打印宠物的名字
     *
     * @param name 宠物的名字
     * @return 宠物的名字
     */
    String name(String name);

    /**
     * 打印宠物的健康值
     *
     * @param health 宠物的健康值
     * @return 宠物的健康值
     */
    int heaith(int health);

    /**
     * 打印宠物的亲密度
     *
     * @param love 宠物的亲密度
     * @return 宠物的亲密度
     */
    int love(int love);

    /**
     * 宠物会说话
     */
    void speak();

    /**
     * 宠物会吃东西
     */
    void eat();
}
