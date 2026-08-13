class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                matrix[i][j]=Integer.MAX_VALUE +1;
                for(int k=0;k<col;k++){
                    if(matrix[i][k]!=0){
                        matrix[i][k]= Integer.MAX_VALUE +1;
                    }
                }
                    for(int l=0;l<row;l++){
                        if(matrix[l][j]!=0){
                            matrix[l][j]=Integer.MAX_VALUE+1;
                        }
                    }
                // }
            }
         }
       } 
       for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==Integer.MAX_VALUE+1){
                    matrix[i][j]=0;
                }
            }
       }
    }
}