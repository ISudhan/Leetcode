class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0,r = 0,minLength = Integer.MAX_VALUE;
        int n = nums.length,sum=0;
        while(r<n && l<=r){
            sum += nums[r++];
            while(sum >= target){
                minLength = (minLength<(r-l+1))?minLength:(r-l);
                sum -= nums[l++];
            }
        }
        if(minLength == Integer.MAX_VALUE){
            minLength = 0;
        }
        return minLength;
    }
}