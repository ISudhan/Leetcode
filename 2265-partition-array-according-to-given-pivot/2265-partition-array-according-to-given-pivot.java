class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] less = new int[nums.length];
        int[] high = new int[nums.length];
        int m = 0,n = 0,e=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>pivot){
                high[n] = nums[i];
                n++;
            }
            else if(nums[i] == pivot) e++;
            else{
                less[m] = nums[i];
                m++;
            } 
        }
        for(int i = 0;i<m;i++){
            nums[i] = less[i];
        }
        for(int i = 0;i<e;i++){
            nums[i+m] = pivot;
        }
        for(int i = 0;i<n;i++){
            nums[i+m+e] = high[i];
        }
        return  nums;
    }
}