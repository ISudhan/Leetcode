class Solution {
    public int minCostToMoveChips(int[] position) {
        int cost1 = 0,cost2 = 0;
        for(int i = 0;i<position.length;i++){
            if(position[i]%2 == 0){
                cost1++;
            }
            else{
                cost2++;
            }
        }
        if(cost1>cost2){
            return cost2;
        }
        else{
            return cost1;
        }

    }
}