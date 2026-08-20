class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int len=nums.length;
        int prefix=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;

        for(int i=0;i<len;i++){
            prefix+=nums[i];
            int rem= prefix % k;
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            if(hm.containsKey(rem)){
                hm.put(rem,(hm.getOrDefault(rem, 1)+1));
            }
            else{
                hm.put(rem,1);
            }
        }
        return count;
    }
}
/* TC=O(n)
SC = O(n)*/