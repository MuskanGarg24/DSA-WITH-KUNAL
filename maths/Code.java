import java.util.*;

public class Code {

    public static int getMaxLunchboxes(int[] items, int A) {
        if (items == null || items.length == 0 || A <= 0) {
            return 0; // invalid input
        }
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i : items) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        int maxLunchboxes = Integer.MAX_VALUE;
        for (int count : counts.values()) {
            maxLunchboxes = Math.min(maxLunchboxes, count / A);
        }
        return maxLunchboxes;
    }

    public static void main(String[] args) {
        int[] items = { 1, 2, 3, 2, 6, 1, 3 };
        int A = 3;
        System.out.println(getMaxLunchboxes(items, A)); // expected output: 2
    }
}
