class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum=0;
        for(int i =0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }

        for(int i= grid[0].length-1;i>=0;i--){
            int max = 0;
            for(int j=0;j<grid.length;j++){

                max = Math.max(max, grid[j][i]);
            }
            sum+=max;
        }
        return sum;
    }
}