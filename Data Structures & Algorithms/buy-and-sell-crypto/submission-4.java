class Solution {
    public int maxProfit(int[] p) {
        int max = 0;
        int l = 0;
        int r = 1;
        int low = p[0];//10
        while(r<p.length){
            if(p[l]<=low){
                low = p[l];//10
            }
            if(p[r]>low){
                max = Math.max(max, p[r]-low);
            }
            r++;
            l++;
        }
        return max;
    }
}
