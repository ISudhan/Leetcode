class Solution {
    public double minimumAverage(int[] nums) {
        double avg[] = new double[nums.length/2];
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            avg[i] = (double)(nums[i]+nums[j])/2;
            i++;
            j--;
        }
        double min = avg[0];
        for(double d:avg){
            if(d<min)
            min = d;
        }
        return min;
    }
}