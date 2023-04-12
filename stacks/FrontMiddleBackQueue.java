import java.util.LinkedList;

public class FrontMiddleBackQueue {

    private LinkedList<Integer> queue;

    public FrontMiddleBackQueue(){
        queue = new LinkedList<>();
    }

    public void pushFront(int val){
        queue.addFirst(val);
    }

    public void pushMiddle(int val){
        int size = queue.size();
        int middle = size/2;
        queue.add(middle, val);
    }

    public void pushBack(int val){
        queue.addLast(val);
    }

    public int popFront(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.removeFirst();
    }

    public int popMiddle(){
        if(queue.isEmpty()){
            return -1;
        }
        int size = queue.size();
        int middle = size/2;
        if(size%2 == 0){
            middle --;
        }
        return queue.remove(middle);
    }

    public int popBack(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.removeLast();
    }

    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(1);   // [1]
        queue.pushBack(2);    // [1, 2]
        queue.pushMiddle(3);  // [1, 3, 2]
        queue.pushMiddle(4);  // [1, 4, 3, 2]
        System.out.println(queue.popFront());   // return 1 -> [4, 3, 2]
        System.out.println(queue.popMiddle());  // return 3 -> [4, 2]
        System.out.println(queue.popMiddle());  // return 4 -> [2]
        System.out.println(queue.popBack());    // return 2 -> []
        System.out.println(queue.popFront());   // return -1 -> [] (The queue is empty)
    }
}
