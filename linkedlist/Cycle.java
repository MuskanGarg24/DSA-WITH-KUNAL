// fast and slow pointer approach

// --> cycle detection
// --> finding a node in a cycle 
// --> finding the length of a cycle

public class Cycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    // cycle detection
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null & fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // length of cycle
    public int cycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null & fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate length of cycle
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // approach -
    // 1. find the length of the cycle
    // 2. move one pointer by length nodes
    // 3. move both pointers until they meet

    // finding a node in a cycle
    public ListNode getCycleStart(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null & fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = cycleLength(slow);
                break;
            }
        }

        if (length == 0)
            return null;

        // find the start node
        ListNode p1 = head;
        ListNode p2 = head;
        while (length > 0) {
            p2 = p2.next;
            length--;
        }

        // keep moving both pointers until they meet
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

}