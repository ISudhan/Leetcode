class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String s:words){
            int c=0;
            for(char ch:s.toCharArray()){
                if(!set.contains(ch)){
                    c=1;
                    break;
                }
            }
            if(c==0){
                count++;
            }
        }
        return count;
    }
}