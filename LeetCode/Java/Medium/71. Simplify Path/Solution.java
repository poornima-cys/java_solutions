class Solution {
    public String simplifyPath(String path) {
       
        String str[]=path.replaceFirst("^/+","").split("/+");
        //String res="/";
       Stack<String> stk=new Stack<>();
       for(String i: str){
        if(i.equals("..") ){
            if(!stk.isEmpty()){
            stk.pop();
        }
        // else{
        //     stk.push(i);
        // }
        }
        else if(i.equals(".")){
            continue;
        }
        else{
            stk.push(i);
        }
       }
        String res="";
        if(stk.isEmpty()){
            return "/";
        }
       while(!stk.isEmpty()){
        String temp=stk.pop();
        temp="/" + temp;
        res=temp+res;
       }
    

       // System.out.println(Arrays.toString(str));
        return res;
    }
}