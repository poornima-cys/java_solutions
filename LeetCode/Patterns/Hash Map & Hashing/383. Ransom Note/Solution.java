class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int fmag[]=new int[26];
       // int fran[]=new int[26];
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        for(int i=0;i<magazine.length();i++){
            fmag[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(fmag[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            fmag[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}