class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
			return 0;
		}
        Set<Integer> numSet = new TreeSet<>();
		for(Integer i : nums) {
			numSet.add(i);
		}
		
		List<Integer> numList = new ArrayList<>();
		for(Integer k : numSet) {
			numList.add(k);
		}
		int count = 1;
		int ref = numList.get(0);
		int longestStreak = 1;
		for(int i = 1; i< numList.size() ; i++) {
			if(numList.get(i)-ref == 1) {
				count++;
			} else {
				if(count>longestStreak) {
					longestStreak = count;
				}
				count = 1;
			}
			
			ref = numList.get(i);
		}
		if(count>longestStreak)
			longestStreak = count;
		return longestStreak;
    }
}
