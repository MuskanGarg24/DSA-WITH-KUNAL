class code1 {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        ans[0] = firstOccurrence(nums,target);
        ans[1] = lastOccurrence(nums,target);
        
        return ans;
        
        
    }
    
     static int firstOccurrence(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            int first = -1;
            while(start<=end){
                int mid = start+ (end-start)/2;
                if(arr[mid]>target){
                    end = mid - 1;
                }
                else if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    first = mid;
                    end = mid-1;
                }
            }
            return first;
        }
        
        static int lastOccurrence(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            int last = -1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]>target){
                    end = mid-1;
                }
                else if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    last = mid;
                    start = mid+1;
                }
            }
            return last;
        }
}