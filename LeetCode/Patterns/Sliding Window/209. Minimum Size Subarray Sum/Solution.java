class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length;
        int first=0,last=0;
        int sum=0, mini=Integer.MAX_VALUE;
        while(first<=last && last<len){
            sum+=nums[last];
            while(sum>=target){
                mini=Math.min(mini, last-first+1);
                sum-=nums[first];
                first++;
            }
            last++;
        }
        if(mini==Integer.MAX_VALUE)
        return 0;

        return mini;
        /*SC=O(1); TC=O(N);*/
    }
}