class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i = 0;i<boxes.length();i++){
            int ops = 0;
            for(int j = 0;j<boxes.length();j++){
                if(i !=j && boxes.charAt(j) == '1') ops += i-j>0?i-j:j-i;
            }
            ans[i] = ops;
        }
        return ans;
    }
}