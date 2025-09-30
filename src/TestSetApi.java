import java.util.HashSet;
import java.util.Set;

public class TestSetApi {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
//        set.remove(1);
        int size = set.size();
        Object[] array = set.toArray();
        boolean contains = set.contains(3);
        System.out.println("contains = " + contains);
    }
}
