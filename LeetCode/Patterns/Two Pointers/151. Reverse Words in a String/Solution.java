class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String ch[]=str.split(" ");
       Collections.reverse(Arrays.asList(ch));
       // System.out.println(Arrays.toString(ch));
        String res="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]==""){
                continue;
            }
            else{
                res+=ch[i];
                res+=" ";
                            }
        }
        return res.trim();
    }
}