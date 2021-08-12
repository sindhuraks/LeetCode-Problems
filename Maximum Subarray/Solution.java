class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length,max_end_here = 0,max_so_far = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            
            max_end_here += nums[i];
            
            if (max_so_far < max_end_here)
                max_so_far = max_end_here;
            if (max_end_here < 0)
                max_end_here = 0;
        }     
        return max_so_far;
    }
}