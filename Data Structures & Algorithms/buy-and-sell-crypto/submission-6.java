class Solution {
    public int maxProfit(int[] p) {
        
        int l = 0;
        int r = 1;
        
        int min = p[0];//10
        int max = 0;
        while(l<p.length){
            if(p[l]<min){
                min = p[l];//10
            } else {
                max = Math.max(max, p[l]-min);
            }
            l++;
        }
        return max;
    }
}
