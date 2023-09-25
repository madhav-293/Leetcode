class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC=0,c=0;
        for(int i:nums){
            if(i==1){
                c++;
                maxC=Math.max(c,maxC);
            }
            else{
                c=0;
            }
        }
        return maxC;
    }
}