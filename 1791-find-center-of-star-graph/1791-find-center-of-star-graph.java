class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int arr[]=new int[n+2];
        for(int i[]:edges){
            arr[i[0]]++;
            arr[i[1]]++;
            if(arr[i[0]]>1){
                return i[0];
            }
            else if(arr[i[1]]>1){
                return i[1];
            }
        }
        return 0;
    }
}