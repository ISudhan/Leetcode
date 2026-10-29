class Solution {
    public int t(int n,int[] tn){
        if(n<=0) return 0;
        if(n==1 || n==2) return 1;
        if(tn[n] != -1) return tn[n];
        return tn[n]=t(n-1,tn)+t(n-2,tn)+t(n-3,tn);
    }
    public int tribonacci(int n) {
        int[] tn = new int[n+1];
        Arrays.fill(tn,-1);
        return t(n,tn);
    }
}