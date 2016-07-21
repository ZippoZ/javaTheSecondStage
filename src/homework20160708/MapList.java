package homework20160708;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zippo on 2016/7/8.
 */
public class MapList {
    public static void main(String[] args) {
        List<Map<String,String>> maps = new ArrayList<Map<String, String>>() ;
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","小明");
        map.put("sex","男");
        map.put("age","13");
        maps.add(map);
        map = new HashMap<String, String>();
        map.put("name","小张");
        map.put("sex","男");
        map.put("age","13");
        maps.add(map);
        map = new HashMap<String, String>();
        map.put("name","小王");
        map.put("sex","男");
        map.put("age","13");
        maps.add(map);
        System.out.println("\n"+maps);
    }
}
