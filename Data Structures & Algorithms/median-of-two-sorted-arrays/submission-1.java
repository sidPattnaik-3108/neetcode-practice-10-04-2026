class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0.0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1+n2];
        int l = 0;
        int r = 0;
        int k = 0;
        while(l<n1 && r<n2){
            if(nums1[l]<=nums2[r]){
                nums[k] = nums1[l];
                l++;
            } else {
                nums[k] = nums2[r];
                r++;
            }
            k++;
        }

        while(l<n1){
            nums[k] = nums1[l];
            l++;
            k++;
        }

        while(r<n2){
            nums[k] = nums2[r];
            r++;
            k++;
        }

        int n = nums.length;
        int mid = n/2;
        if(n%2 == 0){
            return (nums[mid-1]+nums[mid])/2.0;
        } else {
            return (double) nums[n/2];
        }

    }
}
