class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        int i = 0;
        while(i<nums.length){
            int j = 0;
            int prod = 1;
            while(j < nums.length){
                if(i!=j){
                    prod = prod * nums[j];
                }
                j++;
            }
            res[i] = prod;
            i++;
        }
        
        return res;
    }
}  
