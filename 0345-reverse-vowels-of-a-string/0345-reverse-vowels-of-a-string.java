class Solution {
    public String reverseVowels(String s) {
        int i = 0,j = s.length()-1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] c = s.toCharArray();
        while(i<j){
            if((!set.contains(s.charAt(i)))){
                i++;
            }
            else{
                if((!set.contains(s.charAt(j)))){
                j--;
            }
            else{
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            }
        }
        s = "";
        for(char ch:c){
            s += ch;
        }
        return s;
    }
}