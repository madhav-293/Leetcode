class Solution {
    public int minDistance(String word1, String word2) {
        char[] ch = word1.toCharArray();
        char[] ch1 =word2.toCharArray();
        int n=ch.length,m=ch1.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                    if(ch[i-1]==ch1[j-1]){
                        dp[i][j]=dp[i-1][j-1];
                    }
                    else{
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                    }
                }
            }
        return dp[n][m];
        }
        
}
