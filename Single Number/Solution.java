class Solution {
    public int singleNumber(int[] nums) {
     
        int singleNo = 0;
        if(nums.length == 1) {
            return nums[0];
        }
        
        else {
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                if (mp.containsKey(nums[i]))
                    mp.put(nums[i], 1 + mp.get(nums[i]));
                else
                    mp.put(nums[i], 1);
            }
            
            for (Map.Entry entry : mp.entrySet())
            {
                if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                    singleNo = Integer.parseInt(String.valueOf(entry.getKey()));
            }
        }
        return singleNo;
    }   
}