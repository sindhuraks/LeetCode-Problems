class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int majority = 0;
        int n = nums.length/2;
        
        for(int i=0;i<nums.length;i++) {
            
            if(map.containsKey(nums[i])) {
                map.put(nums[i],1+map.get(nums[i]));
            }
            else {
                map.put(nums[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet()) {
            
            if (Integer.parseInt(String.valueOf(entry.getValue())) > n)
                majority = Integer.parseInt(String.valueOf(entry.getKey()));
        }
        return majority;
    }
}
