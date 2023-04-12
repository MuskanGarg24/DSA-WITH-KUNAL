import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueDS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);

        // Deque
        Deque<Integer> deque = new ArrayDeque<>(); // ArrayDeque is faster than LinkedList
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);
    }
}
