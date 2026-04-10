class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max = 0;
        while(l<r){

            int maxHeight = Math.min(heights[l], heights[r]);
            int maxWidth = r-l;
            max = Math.max((maxHeight*maxWidth), max);// 7 
            System.out.println(max);
            if(heights[l]>heights[r]){
                r--;
            } else if(heights[l]<heights[r]){
                l++;
            } else {
                l++;
                r--;
            } 
        }
        return max;
    }
}
