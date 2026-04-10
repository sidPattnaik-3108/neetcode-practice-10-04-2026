class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //-4, -1, -1, 0, 1, 2
        int l = 0;
        while(l<nums.length){
            if(l>0 && nums[l]==nums[l-1]){
                l++;
                continue;
            }
            int k = l+1;
            int r = nums.length-1;

            while(k<r){
                int sum = nums[l]+nums[k]+nums[r];
                if(sum < 0){
                    k++;
                } else if(sum > 0){
                    r--;
                } else {
                    res.add(Arrays.asList(nums[l],nums[k],nums[r]));
                    k++;
                    r--;
                    while(k<r && nums[k] == nums[k-1]) k++;
                }
            }
            l++;
        }

        return res;
    }
}
