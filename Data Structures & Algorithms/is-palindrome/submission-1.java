class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
		int l = 0;
		int r = str.length()-1;
		
		while(r > l) {
			if(str.toLowerCase().charAt(r)!= str.toLowerCase().charAt(l)) {
				return false;
			}
			r--;
			l++;
		}
		
		return true;
    }
}
