class Solution {
    public int equalPairs(int[][] grid) {
        int c=0,midc=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(grid[i][k]==grid[k][j]){
                        midc++;
                        if(midc==n) {c++;
                                    midc=0;}
                    }
                    else{
                        midc=0;
                        break;
                    }
                }
            }
        }
        return c;
    }
}