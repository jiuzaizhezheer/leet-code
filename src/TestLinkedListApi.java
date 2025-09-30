import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedListApi {
        public static void main(String[] args) {
            // 创建一个 LinkedList
            Deque<String> linkedList = new LinkedList<>();

            // 添加元素
            linkedList.add("A");
            linkedList.add("B");
            linkedList.addFirst("C"); // 插入到开头
            linkedList.addLast("D");  // 追加到末尾

            System.out.println("LinkedList: " + linkedList); // 输出: [C, A, B, D]

            // 获取元素
            String firstElement = linkedList.getFirst(); // 获取第一个元素
            String lastElement = linkedList.getLast();   // 获取最后一个元素
            System.out.println("First element: " + firstElement); // 输出: C
            System.out.println("Last element: " + lastElement);   // 输出: D

            // 修改元素
            //linkedList.set(1, "X"); // 将索引为1的元素替换为"X"
            System.out.println("After set: " + linkedList); // 输出: [C, X, B, D]

            // 删除元素
            linkedList.removeFirst(); // 删除第一个元素
            linkedList.removeLast();  // 删除最后一个元素
            System.out.println("After remove: " + linkedList); // 输出: [X, B]

            // 清空链表
            linkedList.clear();
            System.out.println("After clear: " + linkedList); // 输出: []
        }
}
