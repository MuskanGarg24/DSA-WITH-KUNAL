public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 0, 3));
    }

    static int search(int[] arr, int index, int key) {
        // base condition
        if (index == arr.length - 1) {
            return -1;
        }
        // if key == arr[index] return index
        if (arr[index] == key) {
            return index;
        }
        // else call the function again
        return search(arr, index + 1, key);
    }
}

// for multiple occurrences store it in a list and return it
