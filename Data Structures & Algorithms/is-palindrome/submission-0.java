class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^0-9a-zA-Z]","");
        System.out.println(str);

        int l = 0;
        int r = str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}
