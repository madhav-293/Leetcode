class Solution {
    public int missingNumber(int[] nums) {
        int xor1=nums[0],xor2=0,i;
        for(i=1;i<nums.length;i++){
            xor1^=nums[i];
            xor2^=(i);
        }
        xor2^=i;
        return xor1^xor2;
    }
}