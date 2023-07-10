class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        return ((1<<((int)(Math.log(num)/Math.log(2))+1))-1)^num;
    }
}