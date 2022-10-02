// number of times sorted array is rotated

public class sortedArrayRotatedNum {
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,1,2,3};

        System.out.println("Number of times sorted array is rotated = "+MinElementIndex(arr));

    }

    static int MinElementIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid>0 && mid<arr.length-1){
                if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                    return mid;
                }
                else if(arr[mid+1]<arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else if(mid==0){
                if(arr[0]<arr[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(mid==arr.length-1){
                if(arr[arr.length-1]<arr[arr.length-2]){
                    return arr.length-1;
                }
                else{
                    return arr.length-2;
                }
            }
        }
        return -1;
    }
}
