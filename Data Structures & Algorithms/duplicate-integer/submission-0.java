class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> store_number = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(store_number.containsKey(nums[i]))
            {
                return true;
            }
            store_number.put(nums[i],i);
        }

        return false;
    }
}