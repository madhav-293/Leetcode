class Solution {
    public int firstUniqChar(String s) {
        int result=Integer.MAX_VALUE;
        for(char ab='a';ab<='z';ab++){
            int index=s.indexOf(ab);
            if(index!=-1 && index==s.lastIndexOf(ab)){
                result=Math.min(index,result);
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}