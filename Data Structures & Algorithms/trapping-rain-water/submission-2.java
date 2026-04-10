class Solution {
    public int trap(int[] heights) {
        if(heights == null || heights.length == 0) return 0;

        int l = 0;
        int r = heights.length-1;

        int res = 0;

        int leftMax = heights[l];//0
        int rightMax = heights[r];//1



        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax, heights[l]);
                res = res+(leftMax-heights[l]);
            } else {
                r--;
                rightMax = Math.max(rightMax, heights[r]);
                res = res+(rightMax-heights[r]);
            }
        }
        return res;
    }
}
