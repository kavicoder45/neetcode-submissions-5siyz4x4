class Solution {
    public int[] productExceptSelf(int[] nums) {

    List<Integer> result = new ArrayList<>();

    for(int i=0;i<nums.length;i++)
    {
        int product = 1; 

        for(int j = 0; j<nums.length;j++)
        {
            if(i!=j)
            {
                product = product * nums[j];
            }
        }

        result.add(product);
    }

     return result.stream().mapToInt(i -> i).toArray();
        
    }
}  
