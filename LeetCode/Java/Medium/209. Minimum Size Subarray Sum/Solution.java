class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int first=0;
        int last=first;
        int sum=0;
        int flag=0;
        int size=nums.length;
        int a=0;
        while(first<nums.length && last<nums.length){
                sum+=nums[last];
                a++;
                if(sum>=target){
                    first++;
                    last=first;
                    flag++;
                    System.out.println("A here is :" + a + " sum is "+ sum);
                    
                    size=Math.min(size,a);
                    System.out.println("min here is :" + size + " last is "+ last);
                    a=0;
                    sum=0;
                }
                last++;
                
                
        }
        if(flag==0){
            return 0;
        }
        return size;
    }
}