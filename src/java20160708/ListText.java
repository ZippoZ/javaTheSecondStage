package java20160708;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zippo on 2016/7/8.
 */
public class ListText {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add(0,"111");
        list.add(1,"122");
        list.add(2,"112");
        list.add(3,"113");
        list.add(4,"114");
        System.out.println(list);
    }
}
