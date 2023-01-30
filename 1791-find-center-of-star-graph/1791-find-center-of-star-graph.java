import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> o=new HashSet<>();
        for(int i[]:edges){
            if(o.contains(i[1])){
                return i[1];
            }
            else o.add(i[1]);
            if(o.contains(i[0])){
                return i[0];
            }
            else o.add(i[0]);
        }
        return 0;
    }
}