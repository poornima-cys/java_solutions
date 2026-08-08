import java.util.Map.Entry;
class Solution {
    public String intToRoman(int num) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(1,"I");
        tm.put(4,"IV");
        tm.put(5,"V");
        tm.put(9,"IX");
        tm.put(10,"X");
        tm.put(40,"XL");
        tm.put(50,"L");
        tm.put(90,"XC");
        tm.put(100,"C");
        tm.put(400,"CD");
        tm.put(500,"D");
        tm.put(900,"CM");
        tm.put(1000,"M");
        StringBuilder roman=new StringBuilder();
        while(num>0){
            Entry<Integer,String> entry=tm.floorEntry(num);
            roman.append(entry.getValue());
            num-=entry.getKey();
        }
   return roman.toString();
    }
}