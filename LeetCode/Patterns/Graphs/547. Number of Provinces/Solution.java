class Solution {
    
    public int findCircleNum(int[][] isConnected) {
      HashMap<Integer, List<Integer>> hm=new HashMap<>();
      int len=0;
      for(int i=0;i<isConnected.length;i++) {
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1){
                hm.computeIfAbsent(i,k-> new ArrayList<>()).add(j);
            }
        }
      } 
      System.out.print(hm);
      Queue<Integer> q=new LinkedList<>();
      int visited[]=new int[isConnected.length];
      for(int i=0;i<isConnected.length;i++){
        if(visited[i]==0){
            len++;
      q.offer(i);
      visited[i]=1;
      while(!q.isEmpty()){
        int x=q.poll();
        for(int j: hm.getOrDefault(x, new ArrayList<>())){
        if(visited[j]==0){
            visited[j]=1;
            q.offer(j);
        }
        }
      }
        }
      }
      
      return len;
    }
}