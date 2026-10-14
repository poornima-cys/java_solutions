class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        recursion(0,nums,new ArrayList<>(), res);
        return res;
    }
     public void recursion(int index, int nums[], List<Integer>list, List<List<Integer>>res){
       
        if(index==nums.length){
            // res.add(new ArrayList<>());
             res.add(new ArrayList<>(list));
            return;
        }
       
       list.add(nums[index]);
       recursion(index+1, nums, list, res);
       list.remove(list.size()-1);
        recursion(index+1, nums, list, res); 
     }
}