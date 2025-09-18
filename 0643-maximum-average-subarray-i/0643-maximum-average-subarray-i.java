class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l,r;
        double max=Integer.MIN_VALUE,sum=0;
        double avg = sum/k,maxAvg = max/k;
        for(l=r=0;r<nums.length;r++){
            sum += nums[r];
            avg = sum/k;
            if(r-l+1 == k){
                max = Math.max(max,sum);
                maxAvg = Math.max(max/k,avg);
                sum -= nums[l++];
            }
        }
        return maxAvg;
    }
}