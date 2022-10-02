// first and last occurrence of an element 

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,3,3,4,5,6};
        int target = 3;

        System.out.println("First occurrence = "+ firstOccurrence(arr, target));
        System.out.println("last occurrence = "+ lastOccurrence(arr, target));
    }

    static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                res = mid;
                end = mid-1;
            }
        }
        return res;
    }

    static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                res = mid;
                start = mid+1;
            }
        }
    return res;
    }
}
