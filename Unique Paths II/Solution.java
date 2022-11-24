class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int m= g.length,n=g[0].length;
        if(g[0][0]==1)
            return 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||j==0){
                    if(g[i][j]==1 ||(i!=0 && g[i-1][0]==0) || (j!=0 && g[i][j-1]==0)){
                        g[i][j]=0;
                    }
                    else
                        g[i][j]=1;
                }
                else{
                    if(g[i][j]==1){
                        g[i][j]=0;
                    }
                    else
                        g[i][j]=g[i-1][j]+g[i][j-1];
                }
            }
        }
        return g[m-1][n-1];
    }
}
