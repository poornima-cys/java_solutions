class Pair{
    int x, y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public void dirs(int[][] grid, Queue<Pair>q, boolean[][]visited, int row, int col, int distance[][] ){
        int dir[][]=new int[][] {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            int y=curr.y;
            for(int[] temp:dir){
                int newx=x+temp[0];
                int newy=y+temp[1];
                if(newx>=0 && newx<row && newy>=0 && newy<col && visited[newx][newy]==false && grid[newx][newy]==0){
                    q.add(new Pair(newx,newy));
                    distance[newx][newy]=distance[x][y]+1;
                    visited[newx][newy]=true;
                    if(newx==row-1 && newy==col-1){
                        return ;
                    }
                }
            }
        }
        //return -1;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
         if(grid[0][0]==1||grid[row-1][col-1]==1){
            return -1;
        }
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,0));

        int distance[][]=new int[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        distance[0][0]=0;
        
        boolean visited[][]=new boolean[row][col];
       
        dirs(grid, q, visited, row, col, distance);
        return distance[row-1][col-1]+1;

    }
}