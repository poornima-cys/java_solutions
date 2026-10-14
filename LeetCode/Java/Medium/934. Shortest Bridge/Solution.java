class Pair{
    int x, y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int search(int[][] grid, Queue<Pair>q, Queue<Pair>q2, int row, int col){
        //Queue<Pair> q2=new LinkedList<>();
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
           Pair curr= q.poll();
           int x=curr.x;
           int y=curr.y;
           for(int i[]:dir){
            int newx=x+i[0];
            int newy=y+i[1];
            if(newx>=0 && newx<row && newy>=0 && newy<col && grid[newx][newy]==1){
                grid[newx][newy]=2;
                q2.add(new Pair(newx, newy));
                q.add(new Pair(newx, newy));
            }
           }

        }
        int count=0;
         while (!q2.isEmpty()) {
        int size = q2.size();

        for (int k = 0; k < size; k++) {
            Pair curr = q2.poll();
            int x = curr.x;
            int y = curr.y;

            for (int i[] : dir) {
                int newx = x + i[0];
                int newy = y + i[1];

                if (newx >= 0 && newx < row && newy >= 0 && newy < col) {
                    if (grid[newx][newy] == 1) {
                        return count;
                    }

                    if (grid[newx][newy] == 0) {
                        grid[newx][newy] = 2;
                        q2.add(new Pair(newx, newy));
                    }
                }
            }
        }

        count++;
    }

    //return count;
        return count;
    }
    public int shortestBridge(int[][] grid) {
        Queue<Pair>q=new LinkedList<>();
        Queue<Pair>q2=new LinkedList<>();
        //int res=0;
        boolean found=false;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row && !found;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    grid[i][j]=2;
                q.add(new Pair(i,j));
                q2.add(new Pair(i,j));
                found=true;
                break;
                }
            }
        }
        //res=search(grid, q, q2, row, col);
        return search(grid, q, q2, row, col);
    }
}