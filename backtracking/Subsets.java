import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] nums = { 1, 2, 3 };
        getSubsets(list, new ArrayList<Integer>(), nums, 0);
        System.out.println(list);
    }

    public static void getSubsets(ArrayList<ArrayList<Integer>> outer, ArrayList<Integer> inner, int[] nums, int idx) {
        outer.add(new ArrayList<>(inner));
        if (idx == nums.length) {   
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            inner.add(nums[i]);
            getSubsets(outer, inner, nums, i + 1);
            inner.remove(inner.size() - 1);
        }
    }
}
