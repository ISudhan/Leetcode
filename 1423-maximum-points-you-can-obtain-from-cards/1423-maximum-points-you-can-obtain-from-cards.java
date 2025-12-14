class Solution {
    public int maxScore(int[] nums, int k) {
        int max,lsum = 0;
        for(int i = 0;i<k;i++){
            lsum += nums[i];
        }
        max = lsum;
        int rsum = 0;
        int n = nums.length;
        for(int left = k-1,right = n-1;left>-1;left--,right--){
            rsum += nums[right];
            lsum -= nums[left];
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}