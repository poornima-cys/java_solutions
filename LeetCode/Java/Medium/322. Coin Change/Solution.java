class Solution {
    
    private int fun(int coins[], int index, int amt, int dp[][]){
        if(amt<0 || index>=coins.length){
            return Integer.MAX_VALUE-1;
        }
        if(amt==0) return 0;
       if(dp[index][amt]!=-1){
        return dp[index][amt];
       }
        int take=fun(coins, index, amt-coins[index], dp)+1;
        int skip=fun(coins, index+1, amt, dp);
        return dp[index][amt] = Math.min(skip, take);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0 || coins.length==0){
            return 0;
        }
        int dp[][]=new int[coins.length+1][amount+1];
        for(int[] index: dp){
            Arrays.fill(index,-1);
        }
        int res=fun(coins, 0, amount, dp);
        return res==Integer.MAX_VALUE-1? -1 : res;
    }
}
