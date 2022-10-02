// find an element in rotated sorted array

public class FindInRotatedArray {
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,1,2,3};
        int target = 50;

        int minIndex = MinElementIndex(arr);

        int firstArray = binarySearch(arr, target, 0, minIndex);
        int secondArray = binarySearch(arr, target, minIndex+1, arr.length-1);

        if(firstArray==-1){
            System.out.println(secondArray);
        }
        else if(secondArray==-1){
            System.out.println(firstArray);
        }
        else{
            System.out.println(-1);
        }
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

    static int binarySearch(int[] arr, int target, int start, int end){
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
    
}
