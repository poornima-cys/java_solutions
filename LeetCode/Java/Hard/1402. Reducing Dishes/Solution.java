class Solution {
    int[][] dp;
    HashMap<Pair, Integer>hm=new HashMap<>();
    int f(int i, int t, int s[]){
        if(i>=s.length) return 0;
        if(dp[i][t]!=-1){
            return dp[i][t];
        }
        else{
           dp[i][t]= Math.max(s[i]*t + f(i+1, t+1, s), f(i+1, t, s));
        }
        return dp[i][t];
        //Math.max(s[i]*t + f(i+1, t+1, s), f(i+1, t, s));
    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int row=satisfaction.length;
        dp=new int[row][row+2];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        return f(0,1,satisfaction);
    }
}