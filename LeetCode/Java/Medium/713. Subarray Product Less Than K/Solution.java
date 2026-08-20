class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0 || k==1){
            return 0;
        }
        int count=0;
        int product=1;
        int left=0, right=0;
     while(right<nums.length){
        product*=nums[right];
        while(product>=k){
            product/=nums[left];
            left+=1;
        }
        count+=(right-left+1);
        right+=1;
        }
            return count;
        }
    }
