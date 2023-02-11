class Solution {
    public int numberOfBeams(String[] bank) {
          int p=0;
        int res=0;
        for(String s:bank){
            int c=0;
            for(char a:s.toCharArray()){
                if(a=='1'){
                    c++;
                }
            }
            if(c>0){
                res+=p*c;
                p=c;
            }
        }
          return res;
    }
   
}