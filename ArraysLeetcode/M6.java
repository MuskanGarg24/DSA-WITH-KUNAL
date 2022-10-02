// first and last occurrence of an element;


public class M6 {
    public static void main(String[] args) {
        
        int[] arr = {2,4,10,10,10,20};
        int target = 10;

        System.out.println("first occurrence: "+ firstOccurrence(arr, target));
        System.out.println("last occurrence: "+ lastOccurrence(arr, target));
    }

    static int firstOccurrence(int[] arr, int target){
        int first = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                first = mid;
                end = mid - 1;
            }
        }
        return first;
    }

    static int lastOccurrence(int[] arr, int target){
        int last = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                last = mid;
                start = mid + 1;
            }
        }
        return last;
    }   
}
