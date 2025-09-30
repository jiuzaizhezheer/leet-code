import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestStackApi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10); // 入栈
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 查看栈顶元素

        System.out.println("Popped element: " + stack.pop()); // 查看并移除栈顶元素

        System.out.println("Is stack empty? " + stack.empty()); // 判断是否为空

        System.out.println("Position of 10: " + stack.search(10)); // 查找元素的位置
    }
}
