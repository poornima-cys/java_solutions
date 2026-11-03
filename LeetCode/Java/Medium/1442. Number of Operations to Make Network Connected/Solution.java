class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n-1)
        return -1;
     
      HashMap<Integer, List<Integer>> hm=new HashMap<>();
      int len=0;
      for(int i=0;i<connections.length;i++) {
        for(int j=0;j<1;j++){
                hm.computeIfAbsent(connections[i][0],k-> new ArrayList<>()).add(connections[i][1]);
                hm.computeIfAbsent(connections[i][1],k-> new ArrayList<>()).add(connections[i][0]);
            }
        }
       
      //System.out.print(hm);
      Queue<Integer> q=new LinkedList<>();
      int visited[]=new int[n];
      for(int i=0;i<n;i++){
        if(visited[i]==0){
            len++;
      q.offer(i);
      visited[i]=1;
      while(!q.isEmpty()){
        int x=q.poll();
        // System.out.print(x);
        for(int j: hm.getOrDefault(x, new ArrayList<>())){
        if(visited[j]==0){
            visited[j]=1;
            q.offer(j);
        }
        }
      }
        }
      }
      // System.out.print(len);
      return len-1;
    }
}
    
   