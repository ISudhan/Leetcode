class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String s = "";
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            s = "";
            for(int j = 0;j<words[i].length();j++){
                s += arr[words[i].charAt(j) - 'a'];
            }
            System.out.println(s);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return map.size();
    }
}