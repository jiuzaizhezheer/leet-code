import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        for (Integer i : list) {
            System.out.println(i);
        }
        Integer[] nums ={1,2,3};
        List<Integer> list1 = Arrays.asList(nums);
        list1.add(3);
        for (Integer i : list1) {
            System.out.println(i);
        }

    }
}
