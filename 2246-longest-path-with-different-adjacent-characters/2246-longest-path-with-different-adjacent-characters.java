class Solution {
    int maxPath=0;
    public int longestPath(int[] parent, String s){

        //Creating adjacency list

        ArrayList<Integer>[] a = new ArrayList[parent.length];
        
        for(int i=0;i<parent.length;i++)
            a[i] = new ArrayList<Integer>();

        for(int i=1;i<parent.length;i++)
            a[parent[i]].add(i);

        // dfs from root node
        dfs(-1,0,a,s);
        
        return maxPath+1;  //since we have to return no. of vertices in path length, so adding +1
    }

    private int dfs(int prev,int curr,ArrayList<Integer>[] a,String s)
    {
        int maxPath1=0;//first longest Path
        int maxPath2=0;//second longest Path
        for(int x:a[curr]){
            if(x!=prev)
            {
                int pathlength=dfs(curr,x,a,s); //longest path for children node
                pathlength=s.charAt(x)==s.charAt(curr)?0:pathlength+1;
                
                if(pathlength>=maxPath1){
                    maxPath2=maxPath1;
                    maxPath1=pathlength;
                }
                else if(pathlength>=maxPath2)
                    maxPath2=pathlength;
            }
        }
        maxPath = Math.max(maxPath,maxPath1+maxPath2); //updating global maxPath
         
        return maxPath1; //return longest path for children node
    }
}