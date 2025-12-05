class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int i = 1;
        while(i <= x/2){
            if(i == x/i) return i;
            if(i > x/i) return i-1;
            i++;
        }
        return 1;
    }
}