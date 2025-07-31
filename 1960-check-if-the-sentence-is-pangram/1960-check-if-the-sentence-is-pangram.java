class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] a = new int[26];
        for(char ch:sentence.toCharArray()){
            a[ch-'a']++;
        }
        for(int i:a){
            if(i==0)
            return false;
        }
        return true;
    }
}