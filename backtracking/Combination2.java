import java.util.*;

public class Combination2 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
        Arrays.sort(nums);
        sum(nums, list, new ArrayList<Integer>(), 0, 8);
        System.out.println(list);
    }

    public static void sum(int[] nums, List<List<Integer>> outer, List<Integer> inner, int idx, int remain) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            outer.add(new ArrayList<>(inner));
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            inner.add(nums[i]);
            sum(nums, outer, inner, i + 1, remain - nums[i]);
            inner.remove(inner.size() - 1);
        }
    }
}
