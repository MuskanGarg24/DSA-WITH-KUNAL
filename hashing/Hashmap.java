import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {

        // creation
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("US", 100);
        map.put("China", 80);

        // display
        System.out.println(map);

        // updating any value
        map.put("China", 50);
        System.out.println(map);

        // search
        if (map.containsKey("China")) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }

        // get value of a key
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // traversal
        for (HashMap.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // other traversal way
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // deletion 
        map.remove("China");
        System.out.println(map);
    }
}
