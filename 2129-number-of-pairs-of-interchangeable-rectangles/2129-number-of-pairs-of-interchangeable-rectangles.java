class Solution {

    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> map = new HashMap<>();
        long count = 0;
        for(int i = 0;i<rectangles.length;i++){
            double ratio = (double)rectangles[i][0]/(double)rectangles[i][1];
            map.put(ratio,map.getOrDefault(ratio,0)+1);
            count += map.get(ratio) - 1;
        }
        return count;
    }
}
