package homework20160704;

/**
 * Created by Zippo on 2016/7/4.
 * 人类 属性有 姓名、年龄、身高、体重  每种职业都有 自我介绍和工作的方法
 */
public abstract class Person {
    private String name;
    private  int age;
    private  float height;
    private float weight;

    public  Person(String name,int age,float height,float weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
    public  abstract  void  print1();
    public abstract  void print();
}
