import java.util.*;

public class Combination1 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = { 2, 3, 6, 7 };
        sum(list, new ArrayList<Integer>(), nums, 7, 0);
        System.out.println(list);
    }

    public static void sum(List<List<Integer>> outer, List<Integer> inner, int[] nums, int remain, int idx) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            outer.add(new ArrayList<>(inner));
        }
        for (int i = idx; i < nums.length; i++) {
            inner.add(nums[i]);
            sum(outer, inner, nums, remain - nums[i], i);
            inner.remove(inner.size() - 1);
        }
    }
}
