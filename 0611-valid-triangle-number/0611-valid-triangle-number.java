class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) continue;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] == 0) continue;
                for(int k = j+1;k<nums.length;k++){
                    if(nums[k] == 0) continue;
                    if(nums[i]+nums[j]>nums[k]) count++;
                }
            }
        }
        return count;
    }
}