class Solution {
    private int fun(int coins[], int index, int amt){
        if(amt<0 || index==coins.length){
            return Integer.MAX_VALUE-1;
        }
        if(amt==0)return 0;
        int take=fun(coins, index, amt-coins[index])+1;
        int skip=fun(coins, index+1, amt);
        return Math.min(skip, take);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0 || coins.length==0){
            return 0;
        }
        int res=fun(coins, 0, amount);
        return res==Integer.MAX_VALUE-1? -1 : res;
    }
}
