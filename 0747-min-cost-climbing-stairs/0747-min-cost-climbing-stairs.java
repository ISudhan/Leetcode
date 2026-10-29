class Solution {
    public int mccs(int n,int[] cost,int[] mc){
        if(n<0) return 0;
        if(n == cost.length) return Math.min(mccs(n-1,cost,mc),mccs(n-2,cost,mc));
        if(mc[n] != -1) return mc[n];
        return mc[n]= cost[n]+Math.min(mccs(n-1,cost,mc),mccs(n-2,cost,mc));
    }
    public int minCostClimbingStairs(int[] cost) {
        int mc[] = new int[cost.length];
        Arrays.fill(mc,-1);
        return mccs(cost.length,cost,mc);
    }
}