class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int len=nums.length;
        for(int i=0;i<=nums.length;i++){
            sum=sum+nums[i%len];
            max=Math.max(max, sum);
            if(sum<0 || nums[i%len]<0){
                sum=0;
            }
        }
        return max;
    }
}