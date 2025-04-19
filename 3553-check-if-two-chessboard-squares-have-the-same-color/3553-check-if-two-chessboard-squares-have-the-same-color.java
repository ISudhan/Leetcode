class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if(squareIsWhite(coordinate1) && squareIsWhite(coordinate2)){
            return true;
        }
        else if(!squareIsWhite(coordinate1) && !squareIsWhite(coordinate2)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean squareIsWhite(String coordinates) {
        int n = Integer.parseInt(coordinates.charAt(1)+"");
        if(coordinates.charAt(0)%2 == 1){
            if(n%2 == 1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if(n%2 == 1){
                return true;
            }
            else{
                return false;
            }
        }
    }
}