package jianShuJavaExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zippo on 2016/7/12.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        /**
         * 存值
         */
        map.put("name","张三");
        map.put("age","20");
        map.put("sex","男");
        System.out.println(map);
        /**
         * 删除
         */
        map.remove("age");
        System.out.println(map);
        /**
         * 修改
         */
        map.put("name","李四");
        System.out.println(map);
    }
}
