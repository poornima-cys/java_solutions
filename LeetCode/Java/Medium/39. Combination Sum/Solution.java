class Solution {
   void dfs(int i, int arr[], List<Integer>list, List<List<Integer>>res, int t){
        if(i==arr.length){
            if(t==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=t){
            list.add(arr[i]);
            dfs(i, arr, list, res, t-arr[i]);
            list.remove(list.size()-1); 
        }
        dfs(i+1, arr, list, res, t);
           
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>res= new ArrayList<>();
       List<Integer>list=new ArrayList<>();
       dfs(0, candidates,list, res, target );
       return res;
    }
}