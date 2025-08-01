class Solution {
    public String interpret(String command) {
        int i = 0;
        String s = "";
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                i++;
                s += "G";
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                i +=2;
                s += "o";
            }
            else{
                i += 4;
                s += "al";
            }
        }
        return s;
    }
}