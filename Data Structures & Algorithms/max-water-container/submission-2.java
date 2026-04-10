class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

			int l = 0;
			int r = heights.length -1;
			while(l<r) {
				int diff = r-l;
				int area = getArea(diff, r, l,heights);
				if(max<area) {
					max = area;
				}
                if(heights[l]<heights[r]) {
					l++;
				} else {
					r--;
				}
			}
		return max;
    }
    private int getArea(int diff, int r, int l, int[] heights) {
		if(heights[l]<heights[r]) {
			return heights[l]* diff;
		}
		return heights[r]* diff;
	}
}
