class Solution {
    ArrayList<Character> v=new ArrayList<>(Arrays.asList('a','e','i','o','u'));
    public int check(String word){
        int count=0;
        char start=word.charAt(0);
        char last=word.charAt(word.length()-1);
        if(v.contains(start) && v.contains(last)){
            return 1;
        }
        return 0;

    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefix[]=new int[words.length];
        prefix[0]=check(words[0]);
        for(int i=1;i<words.length;i++){
           int c= check(words[i]);
           prefix[i]=prefix[i-1]+c;
        }
        int res[]=new int[queries.length];
        int l=0;
        for(int[] a:queries){
            if(a[0]==0){
                 res[l]=(prefix[a[1]]);
            }
            else{
                 res[l]=(prefix[a[1]]-prefix[a[0]-1]);
            }
           
            l+=1;
        }
        //System.out.println(Arrays.toString(prefix));
        return res;
    }
}