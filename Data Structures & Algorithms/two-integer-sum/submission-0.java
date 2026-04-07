class Solution {
    public int[] twoSum(int[] nums, int target) {

        // I will traverse the array and check each element with other by adding that. 
        // a + b = target and it equals to target - a  = b, now here we have to find this b. 
        //what if it has multiple pair ? 
         
         Map<Integer,Integer> map = new HashMap<>();

         for(int i=0;i<nums.length;i++)
         {
            if(map.containsKey(target - nums[i]))
            {
                 return new int[]{map.get(target - nums[i]),i};
            }

            map.put(nums[i],i);
         }

         return new int[]{};
        
    }
}
