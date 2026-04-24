class Solution {
    public int[] productExceptSelf(int[] nums) {

        /*
         1. check the prefix product
         2. check the suffix product. 
         why ?  becuase In this sum we need product of all num except self so,
         first iter : we can get all the product of let except current index. 
         second iter (R-L): we can get the all product of righ except current inex. 
         when we calculate the right prodct for last and first index we doesn't have anything. 
         so we mark that index as 1. 
        */

        int size = nums.length;

        int[] res = new int[size];
        int[] pref = new int[size];
        int[] suff = new int[size];

        //calculate prefix : 
        pref[0] = 1;
        suff[size - 1] = 1;

        for(int i=1;i<size;i++)
        {
            pref[i] = nums[i - 1] * pref[i - 1];
        }

        for(int i = size - 2; i>=0; i--)
        {
            suff[i] = nums[i + 1] * suff[i + 1];
        }

        for(int i=0;i<size;i++)
        {
            res[i] = pref[i] * suff[i];
        }
        
        return res;
    }
}  
