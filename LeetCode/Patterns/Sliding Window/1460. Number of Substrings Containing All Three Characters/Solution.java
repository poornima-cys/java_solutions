class Solution {
    public int find_min(int arr[]){
       return (arr[0]<arr[1] && arr[0]<arr[2]) ? arr[0] : arr[1]<arr[0] && arr[1]<arr[2] ? arr[1]: arr[2];
        }
    
    public int numberOfSubstrings(String s) {
        int index[]={-1, -1, -1};
        int count=0;
        for(int i=0; i<s.length();i++){
            index[s.charAt(i)-97]=i;
            if(index[0]!=-1 && index[1]!=-1 && index[2]!=-1){
              count=count+ (1 + find_min(index));  
            }
        }
        return count;
        
    }
}