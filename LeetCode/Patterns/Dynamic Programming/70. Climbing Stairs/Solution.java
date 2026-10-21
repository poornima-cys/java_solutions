class Solution {
    public int stairs(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        return stairs(n-1)+ stairs(n-2);
    }
    public int climbStairs(int n) {
        return stairs(n);
    }
}