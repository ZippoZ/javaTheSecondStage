import java.util.HashMap;
import java.util.Map;
class Test{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "football");
        map.put("first", "basketball");
        System.out.println(map.get("first"));
    }
}