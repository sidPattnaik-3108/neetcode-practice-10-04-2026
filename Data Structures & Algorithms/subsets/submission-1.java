class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start){
        if(start == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(start>nums.length) return;
        temp.add(nums[start]);
        backtrack(result,temp,nums,start+1);
        temp.remove(temp.size()-1);
        backtrack(result,temp,nums,start+1);
    }
}
