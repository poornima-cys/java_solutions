class Solution {
    long bfs(int[][] grid, Queue<int[]>q, int row, int col, long sum){
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] temp=q.poll();
            int x=temp[0];
            int y=temp[1];
            for(int[] i: dir){
                int newx=x+i[0];
                int newy=y+i[1];
                if(newx>=0 && newy>=0 && newx<row && newy<col && grid[newx][newy]!=0){
                    sum+=grid[newx][newy];
                    q.add(new int[]{newx,newy});
                    grid[newx][newy]=0;
                }
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        long res=0;
        int count=0;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    long sum=0;
                    q.add(new int[]{i,j});
                    long curr=grid[i][j];
                    grid[i][j]=0;
                    res=bfs(grid, q, row, col, sum+curr);
                    if(res%k==0){count++;}
                }
            }
        }
        return count;
    }
}