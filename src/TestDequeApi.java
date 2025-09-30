import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class TestDequeApi {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //判空
        LinkedList<Object> objects = new LinkedList<>();
        Deque<Object> objects1 = new LinkedList<>();

        int size = deque.size();
        boolean empty = deque.isEmpty();
        // 栈方式入栈
        deque.push(10);
        deque.push(20);
        //查看栈顶元素
        Integer peek = deque.peek();//输出20
        // 栈方式出栈
        System.out.println(deque.pop()); // 输出 20

        // 队列方式入队
        deque.addLast(30);

        // 队列方式出队
        System.out.println(deque.pollFirst()); // 输出 10

        // 查看栈顶元素
        System.out.println(deque.peekFirst()); // 输出 30
    }
}
