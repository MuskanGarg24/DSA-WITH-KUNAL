public class Code16 {
    public int findNumbers(int[] nums) {

        int n = nums.length;

        int count = 0;

        int[] countArr = new int[n];

        for (int i = 0; i < n; i++) {
            countArr[i] = (int) (Math.floor(Math.log10(nums[i]) + 1));
            if (countArr[i] % 2 == 0) {
                count++;
            }
        }

        return count;

    }
}