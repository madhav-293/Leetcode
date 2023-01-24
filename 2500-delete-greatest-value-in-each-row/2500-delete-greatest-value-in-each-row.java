class Solution {
    public int deleteGreatestValue(int[][] grid) {
        //firstly observe a pattern that each time we take every row maximum which can be achieved by sorting and each time we did comparison from each row
       for(int i[]:grid){
           //sorting
           Arrays.sort(i);
       }
       //now we did comparsion column no. of times
       int ans = 0;
       for(int j=0;j<grid[0].length;j++){
           int m = -1;
           //each row one by one we traverse
           for(int row[]:grid){
               //we match the pattern while doing comparsion 
               //in every jth comparsion we take jth element of the row
               m = Math.max(m,row[j]);
           }
           ans += m;
       }

       return ans;

       }
    }