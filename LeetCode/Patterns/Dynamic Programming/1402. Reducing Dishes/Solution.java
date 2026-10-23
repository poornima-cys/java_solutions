class Solution {
    int f(int i, int t, int s[]){
        if(i>=s.length) return 0;
        return Math.max(s[i]*t + f(i+1, t+1, s), f(i+1, t, s));
    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        return f(0,1,satisfaction);
    }
}