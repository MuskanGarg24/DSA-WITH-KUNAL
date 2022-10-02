// order not known binary search

public class OrderNotKnown{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int target = 2;

        if(arr[0]<arr[arr.length-1]){
            System.out.println(AscBinarySearch(arr, target));
        }
        else{
            System.out.println(DescBinarySearch(arr, target));
        }
    }

    static int AscBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int DescBinarySearch(int[] arr, int target){
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