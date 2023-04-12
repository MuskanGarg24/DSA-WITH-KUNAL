// import java.util.LinkedList;

public class LL {

    // creating a node class
    private class Node {
        // data fields
        private int value;
        private Node next;

        // constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // head tail and size
    private Node head;
    private Node tail;
    private int size;

    // constructors
    public LL() {
        this.size = 0;
    }

    /* ********************** Insertion Methods *********************** */
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion 
    public void insert(int value, int index){
        head = insertRec(value, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }


    /* ********************** Deletions Methods *********************** */
    public int deleteFirst() {
        int val = head.value;
        if (head == null) {
            tail = null;
        }
        head = head.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = secondLast.next.value;
        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;
    }

    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }


    /* ********************** Searching Method ************************** */
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    /* ********************** Display Method ************************** */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // reverse linked list using recursion 
    private void reverseRec(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }


    // reverse single linked list and return it
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // merge sort in linked list
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid = getMiddle(head);
        Node nextToMid = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextToMid);
        Node sortedList = merge(left, right);
        return sortedList;
    }

    // getMiddle function 
    public Node getMiddle(Node head){
        if(head==null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge function
    public Node merge(Node a, Node b){
        Node result = null;
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.value<=b.value){
            result = a;
            result.next = merge(a.next, b);
        }else{
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }

    
    public static void main(String[] args) {
        // using internal linkedlist
        // LinkedList<Integer> list1 = new LinkedList();
        // list1.add(1);

        // using custom linkedlist
        LL list2 = new LL();
        list2.insertFirst(1);
        list2.insertFirst(2);
        list2.insertFirst(3);
        list2.insertFirst(4);
        list2.insertFirst(5);
        list2.insertLast(0);
        list2.insertIndex(100, 2);
        list2.display();
        System.out.println(list2.deleteFirst());
        list2.display();
        System.out.println(list2.deleteLast());
        list2.display();
        System.out.println(list2.deleteIndex(2));
        list2.display();
    }
}