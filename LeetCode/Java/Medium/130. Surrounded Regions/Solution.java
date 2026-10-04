class Cell{
    int x;
    int y;
    public Cell(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public boolean isValid(int x, int y ,int rows,int cols){
        if(x>=0 && x<rows && y<cols && y>=0 ){
            return true;
        }
        return false;
    }

    public void solve(char[][] board) {
        int rows=board.length;
        int cols=board[0].length;

        int directions[][]=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        Queue<Cell> q=new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0; j<cols; j++){
                if(i==0 || i==rows-1 || j==0|| j==cols-1){
                    if(board[i][j]=='O'){
                        q.add(new Cell(i,j));
                    }
                }
            }
        }
        while(!q.isEmpty()){
            Cell node=q.poll();
            int newX=node.x;
            int newY=node.y;
            board[newX][newY] = 'B';
            for(int[] arr:directions){
                int x=newX + arr[0];
                int y=newY + arr[1];
                if(isValid(x, y, rows, cols) && board[x][y]=='O'){
                    q.add(new Cell(x, y));
                    board[x][y] = 'B';
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]=='B'){
                    board[i][j] ='O';
                }
                else{
                    board[i][j] ='X';
                }
               
            }
        }
    }

}