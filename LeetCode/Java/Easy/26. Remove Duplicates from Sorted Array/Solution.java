class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length ;i++){
          if(arr.contains(nums[i])){
              c++;
          }
            else{
                arr.add(nums[i]);
            }
        }
        int res=arr.size();
        for(int i=0;i<c ;i++){
        arr.add(0);
    }
        for(int i=0;i<nums.length ;i++){
            nums[i]=arr.get(i);
}
        return res;
    }
}