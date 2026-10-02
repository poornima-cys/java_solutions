class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk=new Stack<>();
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
          stk.add(s.charAt(i));
          else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
          {
            if(stk.empty())
            return false;
            
               else if(s.charAt(i)==')' && stk.peek()=='('){
                  stk.pop();
                }
                else if(s.charAt(i)=='}' && stk.peek()=='{'){
                  stk.pop();
                }
                else if(s.charAt(i)==']' && stk.peek()=='['){
                  stk.pop();
                }
            
            else{
                return false;
            }
           
            }
          }
           if(!stk.empty()){
                return false;
           }
            else
            return true;
       }
        
    }
