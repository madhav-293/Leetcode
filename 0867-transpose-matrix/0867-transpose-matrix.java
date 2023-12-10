class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix.length!=matrix[0].length){
            int[][] matrix2=new int[matrix[0].length][matrix.length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix2[j][i]=matrix[i][j];
                }
            }
            return matrix2;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
            }
        }
        return matrix;
    }
    
}