// recursion program to find largest element in an array

public class LargestEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findLargest(arr, 0));
    }    

    static int findLargest(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        return Math.max(arr[i], findLargest(arr, i+1));
    }
}
