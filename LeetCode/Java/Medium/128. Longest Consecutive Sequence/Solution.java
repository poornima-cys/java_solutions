class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       if(n==0)
       return 0;
       int c=1,g=1;
         for(int i=0;i<n-1;i++)
         {
            if(nums[i+1]==nums[i])
            continue;
          if(nums[i+1]-nums[i]==1){
          c++;
          g=Math.max(c,g);
          }
          else{
            c=1;
            } 
          }
         return g;
       }  
    }
