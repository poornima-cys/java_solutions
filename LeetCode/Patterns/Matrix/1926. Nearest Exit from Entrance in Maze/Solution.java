class Pair{
    int x; int y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int row=maze.length;
        int col=maze[0].length;
        Queue<Pair>q=new LinkedList<>();
        int distance[][]=new int[row][col];
        distance[entrance[0]][entrance[1]]=0;
        maze[entrance[0]][entrance[1]]='+';
        q.add(new Pair(entrance[0], entrance[1]));
        int dir[][]=new int[][] {{0,1},{0,-1},{1,0},{-1,0}};

        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            int y=curr.y;
            for(int i[]: dir){
                int newx=x+i[0];
                int newy=y+i[1];
                if(newx<row && newx>=0 && newy<col && newy>=0 && maze[newx][newy]=='.'){
                    if(newx==0 || newx==row-1 || newy==0 || newy==col-1){
                        return distance[x][y]+1;
                    }
                    else{
                        q.add(new Pair(newx, newy));
                        maze[newx][newy]='+';
                        distance[newx][newy]=distance[x][y]+1;
                    }
                }
            }
        }
        return -1;
    }
}