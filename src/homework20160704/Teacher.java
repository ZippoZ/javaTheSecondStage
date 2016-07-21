package homework20160704;

/**
 * Created by Zippo on 2016/7/4.
 */
public class Teacher extends Person {
    private String job;

    public Teacher(String name, int age, float height, float weight,String job) {
        super(name, age, height, weight);
        this.job = job;
    }

    @Override
    public void print1() {
        System.out.println("我的姓名是："+getName()+"我的年龄是："+getAge()+"岁我的身高为"+getHeight()+
                "cm我的体重是："+getWeight()+"斤我的职业是："+job);
    }

    @Override
    public void print() {
        System.out.println("我在讲课");
    }
}
