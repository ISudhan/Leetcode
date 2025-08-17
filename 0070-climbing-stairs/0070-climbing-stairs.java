class Solution {
    public int climbStairs(int n) {
        int t0 = 1;
        int t1 = 2;
        if(n==1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        for(int i = 0;i<n-2;i++){
            int temp = t0;
            t0 = t1;
            t1 = temp+t1;
        }
        return t1;
    }
}