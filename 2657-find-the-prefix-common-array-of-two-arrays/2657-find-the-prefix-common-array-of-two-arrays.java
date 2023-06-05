class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a=0;
        int n=A.length;
        int arr[]=new int[n];
        int vis[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(++vis[A[i]]==2) a++;
            if(++vis[B[i]]==2) a++;
            arr[i]=a;
        }
        return arr;
    }
}