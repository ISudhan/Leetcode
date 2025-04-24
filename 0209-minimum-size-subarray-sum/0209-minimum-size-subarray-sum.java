class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0,result = Integer.MAX_VALUE,sum=0;
        for(int right = 0;right<nums.length;right++){
            sum += nums[right];
            while(target<=sum){
                result = Math.min(result,right-left+1);
                sum -= nums[left++];
            }
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}