class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer>hm=new LinkedHashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int res=0;
        int i=0;
        for(i=0;i<s.length()-1;i++){
            if(hm.get(s.charAt(i))>=hm.get(s.charAt(i+1))){
                res+=hm.get(s.charAt(i));
            }
            else{
                int big=hm.get(s.charAt(i+1));
                int small=hm.get(s.charAt(i));
                res+=big-small;
                i+=1;
            }
        }
        if(i<s.length()){
          res+=hm.get(s.charAt(s.length()-1));  
        }
       
        return res;
    }
}