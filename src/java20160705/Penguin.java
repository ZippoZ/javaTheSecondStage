package java20160705;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Penguin extends Pet {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        this.setHealth(getHealth());
        System.out.println(this.getName()+"正在打针，吃药体力恢复中.......");
    }
}
