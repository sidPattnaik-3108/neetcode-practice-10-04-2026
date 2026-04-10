class Solution {
    public int singleNumber(int[] nums) {
        return Arrays
        .stream(nums).boxed()
        .collect(Collectors.groupingBy(i->i, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(m->m.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .get();
    }
}
