class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        while(l<nums.length-1){
            if(nums[l]==nums[l+1]) return nums[l];
            l++;
        }
        return -1;
    }
}
