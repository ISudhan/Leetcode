class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int left=0,result=Integer.MIN_VALUE;
        
        for(int right = 0;right<s.length();right++){
            int val  = map.getOrDefault(s.charAt(right),0);
            map.put(s.charAt(right),val+1);

            while(map.get(s.charAt(right))>1){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

            result = Math.max(result,right-left+1);
            
        }
        return result;
    }
}