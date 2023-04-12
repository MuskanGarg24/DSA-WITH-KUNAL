import java.util.ArrayList;

public class DuplicatePermuation {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        printPerm(list, new ArrayList<>(), nums, new boolean[nums.length]);
        System.out.println(list);
    }

    public static void printPerm(ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> inner, int[] nums, boolean[] visited) {
        if (inner.size() == nums.length) {
            outer.add(new ArrayList<>(inner));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            inner.add(nums[i]);
            printPerm(outer, inner, nums, visited);
            visited[i] = false;
            inner.remove(inner.size() - 1);
        }
    }
}
