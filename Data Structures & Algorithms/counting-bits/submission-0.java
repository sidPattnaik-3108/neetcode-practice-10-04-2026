class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i<=n ; i++){
            res[i] = count(i);
        }
        return res;
    }

    private int count(int i){
        String binary = Integer.toBinaryString(i);
        char[] bChar = binary.toCharArray();
        int count = 0;

        for(char c : bChar){
            if(c == '1') count++;
        }
        return count;
    }
}
