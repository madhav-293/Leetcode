class Solution{
	
	public int[][] generateMatrix(int n){
		int[][] ans = new int[n][n];
		
		int i = -1, times = n / 2, val = 1, len;
		int x = 0, y = 0;
		
		while(++i < times){
			len = n - 1 - (2 * i);
			
			for(int j = 0; j < len; j++){
				ans[x][y++] = val++;
			}
			
			for(int j = 0; j < len; j++){
				ans[x++][y] = val++;
			}
			
			for(int j = 0; j < len; j++){
				ans[x][y--] = val++;
			}
			
			for(int j = 0; j < len; j++){
				ans[x--][y] = val++;
			}
			
			x++;
			y++;
		}
		
		if(n % 2 == 1) ans[x][y] = val;
		
		return ans;
	}
}