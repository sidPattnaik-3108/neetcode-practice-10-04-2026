class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set  = new TreeSet<>();

        for(Integer num : nums ){
            set.add(num);
        }

        Integer[] arr = set.toArray(Integer[] :: new);

        int l = 0;
        int r = 1;
        int count = 1;
        while(r<arr.length){
            
            if(arr[r]-arr[r-1]> 1){
                l = r;
            }  
            count = Math.max(count, r-l+1);
            r++;
        }
        return count;
    }
}
