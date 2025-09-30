import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestMapApi {
    public static void main(String[] args) {
        HashMap<Object, Object> HashMap = new HashMap<>();
        Map<Integer, String> integerIntegerMap = Map.of(1, "a", 2, "b");
        HashMap.put(1,"a");
        HashMap.put(2,"b");
        HashMap.put(3,"c");
        Collection<Object> values = HashMap.values();
        Object orDefault = HashMap.getOrDefault("4","d");
       // HashMap.remove(1);
        boolean contains = HashMap.containsKey(3);
        System.out.println(HashMap.get(3));


    }
}
