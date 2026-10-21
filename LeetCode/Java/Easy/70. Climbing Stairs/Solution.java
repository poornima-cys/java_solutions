class Solution {
    HashMap<Integer, Integer> hm=new HashMap<>();
    
    public int stairs(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        else{
            hm.put(n,stairs(n-1)+ stairs(n-2));
        }
        return stairs(n-1)+ stairs(n-2);
    }
    public int climbStairs(int n) {
        hm.put(0,0);
    hm.put(1,1);
    hm.put(2,2);
        return stairs(n);
    }
}