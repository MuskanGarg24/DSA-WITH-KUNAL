// find floor of an element;

public class Floor {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,6};
        int target = 4;
        System.out.println(floorElement(arr, target));
    }

    static int floorElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                res = arr[mid];
                start = mid + 1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return res;
    }
}
