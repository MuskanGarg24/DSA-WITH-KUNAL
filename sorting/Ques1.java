import java.util.Arrays;

public class Ques1 {
    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step,max item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                // or j<=arr.length-i-1
                // swap if the element is smaller than the orevious item
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, stop the program as array is
            // sorted;
            if (!swapped) {
                break;
            }
        }
    }
}
