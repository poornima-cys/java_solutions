class Pair{
    int x, y, t;
    Pair(int x, int y, int t){
        this.x=x;
        this.y=y;
        this.t=t;
    }
}
class Solution {
    public int rot(int[][] grid, Queue<Pair>q, int row, int col){
        int time=-1;
        int r=0;
        int dir[][]=new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            int y=curr.y;
            int t=curr.t;
            for(int[] i: dir){
                int newx=x+i[0];
                int newy=y+i[1];
                if(newx>=0 && newx<row && newy>=0 && newy<col && grid[newx][newy]==1){
                     time=t+1;
                     r=Math.max(r,time);
                    q.add(new Pair(newx, newy, time));
                    grid[newx][newy]=2;
                   
                }
            }
        }
        return r;
    }
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int res=0;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
            }
        }
        res=rot(grid, q, row, col);
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j]==1){
                return -1;
            }
        }
       }
        return res;
        }
    
}