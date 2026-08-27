class Solution {
    public int find_max(int arr[]){
        int m=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    public int characterReplacement(String s, int k) {
        int left=0,right=0;
        int max_freq=0;
        int len=0;
        int freq[]=new int[26];
       while(right<s.length()){
            freq[s.charAt(right)-65]++;
            max_freq=Math.max(max_freq,freq[s.charAt(right)-65]);
            //System.out.println(max_freq);
            while((right-left+1)-max_freq > k){
                freq[s.charAt(left)-65]--;
               // max_freq=0;
                max_freq=find_max(freq);
                left++;
            }
            if((right-left+1)-max_freq<=k){
                len=Math.max(len,(right-left+1));
                //System.out.println("len= "+ len);
            }
            right++;
        } 
        return len;
           }
}