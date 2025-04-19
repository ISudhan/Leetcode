class Solution {
    public String winningPlayer(int x, int y) {
        boolean alice = true;
        String winner = "";
        while(x>0 || y>0){
            if(alice){
                alice = false;
                if(x-1<0 || y-4<0){
                    winner = "Bob";
                    break;
                }
                winner = "Alice";
                x--;
                y -=4;
            }else{
                alice = true;
                if(x-1<0 || y-4<0){
                    winner = "Alice";
                    break;
                }
                winner = "Bob";
                x--;
                y -=4;
            }
        }
        return winner;
    }
}