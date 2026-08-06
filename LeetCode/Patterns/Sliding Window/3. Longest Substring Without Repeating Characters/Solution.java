class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer>hm=new HashMap<>();
        int res=0,max=0;
        char[] arr=s.toCharArray();
        int left=0, right=0;
        while(right<arr.length){
            if(hm.containsKey(arr[right])){
              left=Math.max(left, hm.get(arr[right])+1);
              
            }
            hm.put(arr[right],right);
            max=Math.max(right-left+1, max);
            right++;
        }
        return Math.max(res, max);
    }
}