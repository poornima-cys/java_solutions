class Solution {
    public void add(int nums[], List<Integer>list, int i, List<List<Integer>>set){
        if(i==nums.length ){
            if(!set.contains(list))
            set.add(new ArrayList<>(list));
            return ;
        }
        
        list.add(nums[i]);
        add(nums, list, i+1, set);
        list.remove(list.size()-1);
        add(nums, list, i+1, set);
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        add(nums, list, 0, set);
        return set;
    }
}