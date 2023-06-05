class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n==2) return true;
        double[] slope = new double[n-1];
        for (int i = 1; i < n; i ++)
        {
            slope[i-1] = coordinates[i-1][0]==coordinates[i][0] ? Integer.MAX_VALUE : ((double)(coordinates[i-1][1]-coordinates[i][1]))/((double)(coordinates[i-1][0]-coordinates[i][0]));
        }
        
        for (int i = 1; i < n-1; i ++)
        {
            if (Math.abs(slope[i]-slope[i-1])>1e-6) return false;
        }
        
        return true;
        
    }
}