class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String s;
        for(int i = 2;i<=n-2;i++){
            s = "";
            int num = n;
            while(num != 0){
                int rem = num%i;
                s = rem + s;
                num /=i;
            }
            int p=0,q=s.length()-1;
            while(p<q){
                if(s.charAt(p) != s.charAt(q))
                return false;
                p++;
                q--;
            }
        }
        return true;
    }
}