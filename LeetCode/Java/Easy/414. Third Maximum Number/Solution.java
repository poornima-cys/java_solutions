class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
       for(int i:nums){
        hs.add(i);
       }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(hs);
        if(3>hs.size()){
            return pq.poll();
        }
        int k=3;
        while(k>1){
            pq.poll();
            k-=1;
        }
        return pq.poll();
    }
}