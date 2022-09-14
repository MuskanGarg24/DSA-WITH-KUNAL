// product of all elements in array except self

// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int numsLength = nums.length;
//         int[] result = new int[numsLength];
//         int rightProduct = 1;
        
//         result[0] = 1;
       
//         for(int i=1; i<numsLength; i++){
//             result[i] = result[i-1] * nums[i-1];
//         }
        
//         for(int i=numsLength-1; i>=0; i--){
//             result[i] *= rightProduct;
//             rightProduct *= nums[i];
//         }
        
//         return result;
        
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int product;
        
        int[] productExceptSelf = new int[n];
        
        for(int i=0; i<n; i++){
            product = 1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    product = product * nums[j];
                    productExceptSelf[i] = product;
                }
            }
        }
        
        return productExceptSelf;
        
    }
}