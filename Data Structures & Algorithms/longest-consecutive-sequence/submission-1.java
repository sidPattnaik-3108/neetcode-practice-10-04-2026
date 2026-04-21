class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            int count = 1;
            int ref = nums[i];
            while(set.contains(ref+1)){
                count++;
                ref = ref+1;
            } 
            max = Math.max(max, count);
        }

        return max;
    }
}
