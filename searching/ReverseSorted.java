// binary search on reverse sorted array

public class ReverseSorted {
    public static void main(String[] args) {
        
        int[] arr = {5,4,3,2,1};
        int target = 2;

        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                start = mid+1;
            }
            else if(arr[mid]<target){
                end =mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
