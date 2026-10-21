class Solution {
    HashMap<Integer, Integer> hm=new HashMap<>();
    int f(int i, int cost[]){
        if(hm.containsKey(i)) return hm.get(i);
        else{
            hm.put(i,Math.min(f(i-1, cost),f(i-2, cost))+cost[i]);
        }
        return Math.min(f(i-1, cost),f(i-2, cost))+cost[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        
        hm.put(0,cost[0]);
        hm.put(1, cost[1]);
        int i=cost.length;
        return Math.min(f(i-1, cost),f(i-2, cost));
    }
}