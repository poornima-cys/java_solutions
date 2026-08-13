class Solution {
    public int gcd(int a , int b){
       while(b!=0){
           int temp=b;
           b=a%b;
           a=temp;
       }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        long res=0, max=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int hcf =gcd(nums[i],nums[j]);
                res=((long)nums[i]/hcf) * (nums[j]/ hcf);
                if(res > max){
                    max=res;
                }
                    
                }
            }
        return max;
        }
    }
