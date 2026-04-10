class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        for(int i = 1; i< nums.length; i++ ){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){

            res = m.getValue() == 1 ? m.getKey() : res;
        }
        
        return res;
    }
}
