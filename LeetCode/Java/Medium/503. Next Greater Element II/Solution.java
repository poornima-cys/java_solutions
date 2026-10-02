class Solution {
    
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int n=nums.length;
       
        int[] res=new int[nums.length];
         Arrays.fill(res, -1);
        //stk.push(0);
        for(int i=0;i<2*n;i++){
            int current_element=nums[i%n];
            int index=i%n;
            if(stk.isEmpty()){
                stk.push(index);
            }
            else{
                if(current_element<=nums[stk.peek()]){
                    stk.push(index);
                }
                else{
                    while(!stk.isEmpty() && nums[stk.peek()]<current_element){
                        res[stk.peek()]=current_element;
                        stk.pop();
                    }
                    stk.push(index);
                }
            }
        }
        return res;
    }
}