class Solution {
    public int firstUniqChar(String s) {
        char[] charArr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:charArr){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i = 0;i<s.length();i++){
            if(map.get(charArr[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}