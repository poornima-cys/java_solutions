class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int max=0;
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);
       for(Map.Entry<Integer,Integer>e:hm.entrySet()){
        if(e.getValue()>max){
            max=e.getValue();
            res= e.getKey();
        }
       }
        
        return res;
    }
}