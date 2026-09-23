class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
    Set<String> set=new HashSet<>(wordList);
    int c=1;
    Queue<String> q=new LinkedList<>();
   
    q.offer(beginWord);
    set.remove(beginWord);
  if(!set.contains(endWord)){
    return 0;
  }

    while(!q.isEmpty()){
        int size=q.size();
        
        for(int j=0;j<size;j++){
            String temp=q.poll();
            char tempArr[]=temp.toCharArray();
    for(int i=0;i<temp.length();i++){
        char ch= tempArr[i];
        if(temp.equals(endWord)){
            return c;
        }
        for(char k='a'; k<='z';k++){
            tempArr[i]=k;
            String word=new String(tempArr);
            if(set.contains(word)){
                q.offer(word);
                set.remove(word);
            }
        }
        tempArr[i]=ch;
    }
    }
    c++;
    }
    return 0;
    }
}