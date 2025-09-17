class Solution {
    public int trap(int[] h) {
        int[] lmax = new int[h.length];
        int max = 0;
        for(int i = 0;i<h.length;i++){
            if(h[i]>max) max=h[i];
            lmax[i] = max;
        }
        int[] rmax = new int[h.length];
        max = 0;
        for(int i = h.length-1;i>=0;i--){
            if(h[i]>max) max=h[i];
            rmax[i] = max;
        }
        int sum = 0;
        for(int i = 0;i<h.length;i++){
            sum += Math.min(lmax[i],rmax[i])-h[i];
        }
        return sum;
    }
}