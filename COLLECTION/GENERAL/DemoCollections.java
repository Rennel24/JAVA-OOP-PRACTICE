import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class DemoCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Set<String> set = new HashSet<>();
        set.add("Cat");
        set.add("Dog");

        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("English", 85);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}
