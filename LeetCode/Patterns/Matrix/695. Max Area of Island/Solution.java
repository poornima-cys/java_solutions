class Pair{
    int x, y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int traverse(int grid[][], Queue<Pair>q, int row, int col){
        int c=0;
        int dir[][]= new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            c++;
            Pair p=q.poll();
            int x=p.x;
            int y=p.y;
            for(int i[]: dir){
                int newx=x+i[0];
                int newy=y+i[1];
                //c++;
                if(newx<row && newx>=0 && newy>=0 && newy<col && grid[newx][newy]==1){
                    grid[newx][newy]=0;
                    //c++;
                    q.add(new Pair(newx, newy));
                   
                }
            }
        }
        return c;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
       // int c=0;
        int max=Integer.MIN_VALUE;
        int row=grid.length;
        int col=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    //c++;
                    grid[i][j]=0;
                    q.add(new Pair(i,j));
                    res=traverse(grid, q, row, col);
                    max=Math.max(res,max);
                    //c=0;
                }
            }
        }
        return Math.max(max,res);
    }
}