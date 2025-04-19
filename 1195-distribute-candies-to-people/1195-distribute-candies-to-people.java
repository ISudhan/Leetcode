class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int i = 0;
        int n = 1;
        while(candies > 0){
            if(i>=num_people){
                i = 0;
            }
            if(candies - n < 0){
                arr[i] += candies;
                candies = 0;
                
            }
            else{
                candies = candies - n;
                arr[i++] += n++;
            }
        }
        return arr;
    }
}