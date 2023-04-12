import java.util.*;

public class GFG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size()) {
            return q;
        }
        if (k <= 0) {
            return q;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
        return q;
    }

    public static void main(String[] args) {
        GFG gfg = new GFG();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println("queue = " + gfg.modifyQueue(q, 3));
    }

}
