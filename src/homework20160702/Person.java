package homework20160702;

/**
 * Created by Zippo on 2016/7/2.
 * 创建一个人类
 */
public class Person {
    String name;
    int age;
    String sex;
    float height;
    float weight;

    /***
     * 获取用户输入的姓名
     * @return 人类的姓名
     */
    public String getName() {
        return name;
    }

    /***
     * 给人的姓名赋值
     * @param name 传回来的人的姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * 获取人的年龄
     * @return 人的年龄
     */
    public int getAge() {
        return age;
    }

    /***
     * 给人的年龄赋值
     * @param age 传回来的人的年龄
     */
    public void setAge(int age) {
        if (age<130&&age>0) {
            this.age = age;
        }else{
            this.age = 18;
            System.err.println("输入有误！！默认为18");
        }
    }

    /***
     * 获取人的性别
     * @return 人的性别
     */
    public String getSex() {
        return sex;
    }

    /***
     * 给人的性别赋值
     * @param sex 传回来的人的性别
     */
    public void setSex(String sex) {
        if ("男".equals(sex)||"女".equals(sex)){
            this.sex =sex;
        }else {
            this.sex = "男";
            System.err.println("输入有误！！！默认为男");
        }
    }

    /***
     * 获取人的身高
     * @return 人的身高
     */
    public float getHeight() {
        return height;
    }

    /***
     * 给人的生身高赋值
     * @param height 传回来的人的身高
     */
    public void setHeight(float height) {
        if (height<230&&height>0) {
            this.height = height;
        }else{
            this.weight = 160f;
            System.err.println("输入有误！！默认为160");
        }
    }
    /***
     * 获取人的体重
     * @return 人的体重
     */
    public float getWeight() {
        return weight;
    }

    /***
     * 给人的体重赋值
     * @param weight 传回来的人的体重
     */
    public void setWeight(float weight) {
        if (weight<210&&weight>0) {
            this.weight = weight;
        }else{
            this.weight = 100f;
            System.err.println("输入有误！！默认为100");
        }
    }
    public String toString(){
        return "我的姓名叫"+name+","+sex+".我今年"+age+"岁了，我的身高是"+height+"cm,我的体重是"+weight+"斤";
    }
}
