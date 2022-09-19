// create target array in given order

import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> arrList=new ArrayList<>();
         
        int target[] = new int[index.length];
        
        for(int i=0;i<nums.length;i++){
            arrList.add(index[i],nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            target[i]=arrList.get(i);
        }
        
        return target;
    }
}