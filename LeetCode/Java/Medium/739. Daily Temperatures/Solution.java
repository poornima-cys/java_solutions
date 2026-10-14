class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] =new int [temperatures.length];
        Stack<Integer> stk=new Stack<>();
       
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stk.isEmpty() && temperatures[stk.peek()]<=temperatures[i]){
                
                    stk.pop();
                }
                if(!stk.isEmpty()){
                    res[i]=stk.peek()-i;
                }
                else
                res[i]=0;
                stk.push(i);
            }
        
        return res;
    }
}