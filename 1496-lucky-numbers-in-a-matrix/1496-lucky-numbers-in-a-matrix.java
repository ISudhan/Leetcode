class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int ind = 0;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    ind = j;
                }
            }
            boolean flag = true;
            for(int j = 0;j<matrix.length;j++){
                if(matrix[j][ind] <= min){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(min);
            }
        }
        return list;
    }
}