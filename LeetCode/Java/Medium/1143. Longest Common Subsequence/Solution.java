class Solution {
    public int f(int i, int j, int c, String s1, String s2){
        if(i>=s1.length() || j>=s2.length()){
            return c;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return f(i+1,j+1,c+1,s1, s2);
        }
        return Math.max(f(i, j+1,c, s1, s2), f(i+1, j,c, s1,s2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        return f(0,0,0,text1, text2);
    }
}