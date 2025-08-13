class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] ans = new int[size];
        for (int i =0 ; i<nums1.length ; i++){
            ans[i]=nums1[i];
        }
        for (int i =0 ; i<nums2.length ; i++){
            ans[i+nums1.length]=nums2[i];
        }
        Arrays.sort(ans);
        if (size%2==0){
            double a =(ans[size/2-1]+ans[size/2])/2.0;
            return a;
        }
        else{
            return ans[size/2];
        }
        
    }
}