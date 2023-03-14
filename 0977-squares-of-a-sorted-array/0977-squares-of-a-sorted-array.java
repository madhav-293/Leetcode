class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1,p=n-1;
        while(i<=j){
            if(Math.abs(A[i])<Math.abs(A[j])){
                result[p]=A[j]*A[j];
                j--;
            }
            else{
                result[p]=A[i]*A[i];
                i++;
            }
            p--;
            
        }
        return result;
    }
}