class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ind = new int[2];
        int c=0;
        for(int i:nums){
            c++;
        }
        for(int i=0;i<c-1;i++){
            for(int j=i+1;j<c;j++){
                if(nums[j]+nums[i]==target){
                    ind[0] = i;
                    ind[1] = j;
                    break;
                }
            }
        }
        return ind;
    }
}
    