class Solution {
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