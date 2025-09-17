class Solution {
    public int majorityElement(int[] nums) {
        int c= 0;
        int num = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(c==0) num = nums[i];
            if(nums[i] == num) c++;
            else c--;
        }
        return num;
    }
}