class Solution {
    HashMap<Integer, Integer> hm=new HashMap<>();
    public int f(int[] a, int i){
        // if(i==0){
        //     return a[0];
        // }
        // if(i==1){
        //     return Math.max(a[0], a[1]);
        // }
        if(hm.containsKey(i)){
            return hm.get(i);
        }
        else{
            hm.put(i,Math.max(f(a, i-1), a[i]+f(a, i-2)));
        }
        return Math.max(f(a, i-1), a[i]+f(a, i-2));
    }
    public int rob(int[] nums) {
        int n=nums.length-1;
        hm.put(0,nums[0]);
        hm.put(1, Math.max(nums[0], nums[1]));
        return f(nums,n);
    }
}