package homework20160705;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Dog extends Pet{
    private String strain;

    /***
     * 获取狗的品种
     * @return 狗的品种
     */
    public String getStrain() {
        return strain;
    }

    /***
     * 对狗的品种赋值
     * @param strain 狗的品种
     */
    public void setStrain(String strain) {
        this.strain = strain;
    }

    /***
     * 给狗喂食
     */
    @Override
    public void feed() {
        System.out.println("我的名称为："+getName()+"我是"+strain+"主人正在给我喂骨头！！！"+"我现在和主人的亲密度为"+getLove());
    }
}
