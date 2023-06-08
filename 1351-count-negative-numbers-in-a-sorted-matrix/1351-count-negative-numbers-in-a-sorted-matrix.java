class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] < 0){
                   count += grid[i].length - j; // since the array is sorted, as soon as first negative is found, remaining can be counted instantly and no need to traverse any more.
                    break;
                }
            }
        }
        return count;
    }
}