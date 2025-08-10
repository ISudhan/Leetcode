class Solution {
    public int maxFreqSum(String s) {
       int max_vow=0,max_con=0;
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        max_vow = max_vow<map.get(ch)?map.get(ch):max_vow;
        else
        max_con = max_con<map.get(ch)?map.get(ch):max_con;
       }
       return max_con+max_vow; 
    }
}