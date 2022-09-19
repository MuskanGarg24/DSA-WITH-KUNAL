// find the highest altitude

class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        
        int height[]=new int[n+1];
        
        int maxHeight=0;
        for(int i=1;i<height.length;i++)
        {
                height[i]=height[i-1]+gain[i-1];
                
                maxHeight=Math.max(maxHeight, height[i]);
        }
        
        return maxHeight;
        
    }
}