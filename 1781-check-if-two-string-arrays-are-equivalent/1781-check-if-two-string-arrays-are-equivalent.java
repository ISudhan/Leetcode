class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "",w2 = "";
        for(String w:word1){
            w1 += w;
        }
        for(String w:word2){
            w2 += w;
        }
        return w1.equals(w2)?true:false;
    }
}