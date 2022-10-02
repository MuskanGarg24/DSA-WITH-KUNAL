// count of an element in a sorted array

public class Count {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,4,4,5};
        int target = 4;

        int count = lastOccurrence(arr, target)-firstOccurrence(arr, target) + 1;

        System.out.println("Count of target element is "+ count);

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
