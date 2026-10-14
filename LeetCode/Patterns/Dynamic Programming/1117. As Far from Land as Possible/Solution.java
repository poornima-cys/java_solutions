class Solution {
    public int maxDistance(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] distance=new int[row][col];
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                   q.add(new int[]{i,j});
                   distance[i][j]=0;
                }
            }
        }
        if(q.size()==0 || q.size()==row*col){
            return -1;
        }
        int dis=0;
         int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
         while(!q.isEmpty()){
            int curr[]=q.poll();
            int r=curr[0];
            int c=curr[1];
                for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < row && nc < col &&
                    grid[nr][nc] == 0 ) {
                        grid[nr][nc]=1;
                    q.add(new int[]{nr, nc});
                    distance[nr][nc]=distance[r][c] + 1;
                    dis=Math.max(dis,distance[nr][nc]);
                }
            }
         }
         return dis;
    }
}