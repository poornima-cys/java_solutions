class Solution {
    public int maxProfit(int[] prices) {
        int max=0, min=prices[0];
        for(int i=0;i<prices.length-1;i++){
            min=Math.min(min, prices[i]);
            max=Math.max(max, prices[i+1]-min);
        }
        return max;
    }
}