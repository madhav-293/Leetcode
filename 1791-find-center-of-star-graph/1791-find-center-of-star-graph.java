class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][1]==edges[1][1] || edges[0][1]==edges[1][0]){
            return edges[0][1];
        }
        return edges[0][0];
    }
}