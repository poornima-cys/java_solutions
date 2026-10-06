class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int tsum=0;
        int minsum=0;
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            minsum=minsum+nums[i];
            tsum+=nums[i];
            max=Math.max(max, sum);
            min=Math.min(minsum, min);
             // System.out.println("maxsum is" + max); 
             //System.out.println("minsum is" + minsum);
            if(sum<0){
                sum=0;
            }
            if(minsum>0){
                minsum=0;
            }
        }
      //  System.out.println("tsum is" + tsum);
      //  System.out.println("tsum +minsum is" + (tsum-min));
            if(max<0){
                return max;
            }
       return Math.max(max, tsum-min);
    }
}