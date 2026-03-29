class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long ans = 0;
        HashMap<Double,Long> map = new HashMap<>();
        double[] arr = new double[rectangles.length];
        for(int i = 0;i<rectangles.length;i++){
            arr[i] = (double)rectangles[i][0]/(double)rectangles[i][1];
            System.out.println(arr[i]);
        }
        for(double i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                long n = map.get(i);
                long sum = (n*(n+1))/2;
                long sum_sub = ((n-1)*n)/2;
                ans += sum - sum_sub;
                System.out.print(i);
            }
            else map.put(i,(long)0);
        }
        return ans;
    }
}