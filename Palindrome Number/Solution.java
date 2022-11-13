class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0))
            return false;
        int rNum=0;
        while(rNum<x){
            rNum=rNum*10+(x%10);
            x/=10;
        }
        return rNum==x || x==rNum/10;
    }
}
