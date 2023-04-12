import java.util.*;;

public class PermutationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = new ArrayList<>();
        printPerm(list, new ArrayList<>(), nums);
        System.out.println(list);
    }

    public static void printPerm(List<List<Integer>> outer, List<Integer> inner, int[] nums) {
        if (inner.size() == nums.length) {
            outer.add(new ArrayList<>(inner));
        }
        for (int i = 0; i < nums.length; i++) {
            // element already exists, skip
            if (inner.contains(nums[i])) {
                continue;
            }
            inner.add(nums[i]);
            printPerm(outer, inner, nums);
            inner.remove(inner.size() - 1);
        }

    }
}
