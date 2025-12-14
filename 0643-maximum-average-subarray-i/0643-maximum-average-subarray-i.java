class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg,sum=0;
        int left = 0,right = 0;
        while(right < k){
            sum+=nums[right];
            right++;
        }
        maxAvg = sum/k;
        while(right<nums.length){
            sum -= nums[left];
            sum += nums[right];
            maxAvg = Math.max(maxAvg,sum/k);
            left++;
            right++;
        }
        return maxAvg;
    }
}