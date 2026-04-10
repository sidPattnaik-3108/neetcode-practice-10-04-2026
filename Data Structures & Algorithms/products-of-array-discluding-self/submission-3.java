class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] finalArr = new int[nums.length];
        int left = 1, right = 1;
        for(int i = 0; i< nums.length; i++){
            finalArr[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length-1; i>=0; i--){
            finalArr[i]*=right;
            right *= nums[i];
        }

        return finalArr;
    }


}  
