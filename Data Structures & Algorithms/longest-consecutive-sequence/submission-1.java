class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Set<Integer> set = new TreeSet<>();

        for(int i : nums){
            set.add(i);
        }

        List<Integer> list = new ArrayList<>();
        for(int i : set){
            list.add(i);
        }
        
        int count = 1;
        int streak = 1;
        int ref = list.get(0);

        System.out.println(set);

        for(int i = 1; i< list.size(); i++){
            int n = list.get(i);
            if(n-ref == 1){
                count++;
            } else {
                streak =Math.max(count, streak);
                count = 1;
            }
            ref = list.get(i);
        }
        streak =Math.max(count, streak);
        return streak;
        
    }
}
