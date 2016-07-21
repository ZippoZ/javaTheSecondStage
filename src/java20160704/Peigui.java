package java20160704;

/**
 * Created by Zippo on 2016/7/4.
 */
public class Peigui extends Pet {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print(String name, int health, int love) {
        System.out.println("name::::"+getName()+"health::::"+getHealth()+"love::::"+getLove()+"sex:::"+sex);
    }
}