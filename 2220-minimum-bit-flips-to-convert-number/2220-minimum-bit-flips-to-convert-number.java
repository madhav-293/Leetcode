class Solution {
    public int minBitFlips(int start, int goal) {
        if(start==goal)
            return 0;
        int x=start^goal;
        int c=0;
        while(x>0){
            x=x&(x-1);
            c++;
        }
        return c;
    }
}