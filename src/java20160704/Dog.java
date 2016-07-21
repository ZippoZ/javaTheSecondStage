package java20160704;

/**
 * Created by Zippo on 2016/7/4.
 */
public class Dog extends Pet {
    private String strain;

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
    @Override
    public void print(String name,int health,int love) {
        System.out.println("name::::"+getName()+"health::::"+getHealth()+"love::::"+getLove()+"strian::::"+strain);
    }
}
