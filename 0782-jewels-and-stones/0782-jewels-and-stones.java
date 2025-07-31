class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c = 0;
        for(char ch:jewels.toCharArray()){
            c += map.containsKey(ch)?map.get(ch):0;    
        }
        return c;
    }
}