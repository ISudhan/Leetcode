class Solution {
    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        for(char ch:s.toCharArray()){
            a[ch-'a'] += 1;
        }
        for(char ch:t.toCharArray()){
            if(a[ch-'a'] == 0){
                return ch;
            }
            a[ch-'a'] -=1;
        }
        return ' ';
    }
}