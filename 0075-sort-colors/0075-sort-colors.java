class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int m = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]<nums[m]){
                    m = j;
                }
            }
            int temp = nums[m];
            nums[m] = nums[i];
            nums[i] = temp;
        }
    }
}