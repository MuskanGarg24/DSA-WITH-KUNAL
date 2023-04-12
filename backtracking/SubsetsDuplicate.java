import java.util.*;

public class SubsetsDuplicate {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] nums = { 1, 1, 2 };
        Arrays.sort(nums);
        getSubsets(list, new ArrayList<Integer>(), nums, 0);
        System.out.println(list);
    }

    public static void getSubsets(ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> inner, int[] nums, int idx) {
        outer.add(new ArrayList<>(inner));
        if (idx == nums.length) {
            return;
        }
        int prev = -1;
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue; // skip duplicates subsets
            }
            if (i>idx && nums[i] == prev) {
                continue; // skip elements already added to the current subset
            }
            inner.add(nums[i]);
            getSubsets(outer, inner, nums, i + 1);
            prev = nums[i];
            inner.remove(inner.size() - 1);
        }
    }

}
