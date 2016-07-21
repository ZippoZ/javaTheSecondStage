package java20160705;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Dog extends Pet{
    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    private String strain;



    @Override
    public void print() {
        this.setHealth(getHealth());
        System.out.println(this.getName()+"正在打针，吃药体力恢复中.......");
    }
}
