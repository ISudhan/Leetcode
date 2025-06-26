import java.util.HashMap;
class Solution {
    int fibonacci(int n, HashMap<Integer,Integer> map){
        if(n==0 || n==1){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = fibonacci(n-1,map)+fibonacci(n-2,map);
        map.put(n,result);
        return result;
    }

    public int fib(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return fibonacci(n,map);
    }
}