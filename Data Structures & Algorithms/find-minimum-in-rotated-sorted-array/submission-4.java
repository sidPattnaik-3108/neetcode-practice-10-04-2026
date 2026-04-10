class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]<nums[l]){
                r = mid;
            } else if(nums[r]<nums[mid]){
                l = mid+1;
            } else {
                return nums[l];
            }
        }

        return nums[r];
    }
}
