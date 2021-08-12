class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=0;
        int[] expectedNums = new int[nums.length];
        
        if(nums.length == 0 || nums.length ==1)
            return nums.length;
        
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]!=nums[i+1]) {
                expectedNums[k++] = nums[i];
            }
        }
        expectedNums[k++] = nums[nums.length-1];
        
        for(int j=0;j<k;j++) {
            nums[j] = expectedNums[j];
        }

        return k;
    }
}