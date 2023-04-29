import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();
        // inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        // searching
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contains 6");
        }
        // delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("deleted 1");
        }
        // size
        System.out.println(set.size());
        // display
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print("display : " + it.next() + " ");
        }
    }
}