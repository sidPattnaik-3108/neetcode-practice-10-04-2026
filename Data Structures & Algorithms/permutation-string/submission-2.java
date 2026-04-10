class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int range = s2.length()-s1.length();
        char[] second = s1.toCharArray();
        while(i<=range) {
        	char[] first = s2.substring(i, i+s1.length()).toCharArray();
            Arrays.sort(first);
        	Arrays.sort(second);
        	if(Arrays.equals(first, second)) {
        		return true;
        	}
        	i++;
        }
        return false;
    }
}
