class Pair{
    int x, y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public void dircheck(boolean[][] v, char[][] c, Queue<Pair>q, int row, int col){
        int dir[][]=new int[][] {{0,1},{0,-1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            int y=curr.y;
            for(int[] temp: dir){
                int newx=x+temp[0];
                int newy=y+temp[1];
                if(newx>=0 && newx<row && newy>=0 && newy<col){
                    if(v[newx][newy]!=true && c[newx][newy]=='O'){
                    c[newx][newy]='1';
                    v[newx][newy]=true;
                    q.add(new Pair(newx, newy));
                }
                }
            }
        }

    }
    public void solve(char[][] board) {
        Queue<Pair>q=new LinkedList<>();
       
        int row=board.length;
        int col=board[0].length;
         boolean[][] v=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||(i==row-1)||j==0||j==col-1){
                    if(board[i][j]=='O'){
                        q.add(new Pair(i,j));
                        v[i][j]=true;
                        board[i][j]='1';
                    }
                }
            }
        }
        dircheck(v, board, q, row, col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='1'){
                    board[i][j]='O';
                }
                else{
                    board[i][j]='X';
                }
            }
        }
        //return board;
    }
}