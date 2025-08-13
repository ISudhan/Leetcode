class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
        return 0;
        int maxDiff = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>maxDiff)
            maxDiff = nums[i+1]-nums[i];
        }
        return maxDiff;
    }
}