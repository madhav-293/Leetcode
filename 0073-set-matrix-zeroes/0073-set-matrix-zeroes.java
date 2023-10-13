class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    fillRow(matrix,i);
                    fillColumn(matrix,j);
                    flag=false;
                }
            }
        }
        if(flag) return;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1234567){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
    public static void fillRow(int[][] matrix,int i){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1234567;
            }
        }
    }
    public static void fillColumn(int[][] matrix,int i){
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][i]!=0){
                matrix[j][i]=-1234567;
            }
        }
    }
}