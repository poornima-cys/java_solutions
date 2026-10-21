class Solution {
    public int f(int[] a, int i){
        if(i==0){
            return a[0];
        }
        if(i==1){
            return Math.max(a[0], a[1]);
        }
        return Math.max(f(a, i-1), a[i]+f(a, i-2));
    }
    public int rob(int[] nums) {
        int n=nums.length-1;
        return f(nums,n);
    }
}