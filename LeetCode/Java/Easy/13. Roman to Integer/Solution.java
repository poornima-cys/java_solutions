class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> lm=new LinkedHashMap<>();
        lm.put('I',1);
        lm.put('V',5);
        lm.put('X',10);
        lm.put('L',50);
        lm.put('C',100);
        lm.put('D',500);
        lm.put('M',1000);
        int res=0;
            for(int i=0;i<s.length();i++){
                if(i==s.length()-1){
                    res+=lm.get(s.charAt(i));
                }
                else if(lm.get(s.charAt(i))>=lm.get(s.charAt(i+1))){
                    res+=lm.get(s.charAt(i));
                }
                else{
                    res-=lm.get(s.charAt(i));
                }
            }
        return res;
        
    }
}