import java.util.Arrays;

public class media {
    public static void main(String[] args) {

        int[] nums1 = { 1, 5, 3};
        int[] nums2 = { 2 };
        int[] mergedArray = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            mergedArray[nums1.length + j] = nums2[j];
        }

        Arrays.sort(mergedArray);
        System.out.println(median(mergedArray));
    }

    static int median(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        if (arr.length % 2 == 0) {
            return (arr[mid] + (arr[mid + 1])) / 2;
        }
        return arr[mid];
    }
}
