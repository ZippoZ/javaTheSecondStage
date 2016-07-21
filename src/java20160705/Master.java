package java20160705;

/**
 * Created by Zippo on 2016/7/5.
 */
public class Master {
    public void cure(Pet pet){
        if (pet.getHealth()<50){
            pet.print();
        }
    }
}
