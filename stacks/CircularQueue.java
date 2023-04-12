public class CircularQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    protected int end = 0;
    protected int front = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove(int item) {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
        } while (i != end);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
    }

}
