class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);
            map.computeIfAbsent(s, ss->new ArrayList<>()).add(str);
        }

        

        return map.entrySet().stream().map(m->m.getValue()).collect(Collectors.toList());
    }
}
