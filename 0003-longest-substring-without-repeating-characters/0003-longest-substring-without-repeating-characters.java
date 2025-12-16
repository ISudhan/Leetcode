class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = 0,right = 0,left = 0;
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right))+1 > left)
                left = map.get(s.charAt(right))+1;
                map.put(s.charAt(right),right);
            }
            else{
                map.put(s.charAt(right),right);
            }
            System.out.println(left+" "+right);
            maxLen = Math.max(right-left+1,maxLen);
            System.out.println(maxLen);
            right++;
        }
        return maxLen;
    }
}