class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 1, ans = 0;
        for(String str : sentences){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
            ans = Math.max(ans, count);
            count = 1;
        }
        return ans;
    }
}