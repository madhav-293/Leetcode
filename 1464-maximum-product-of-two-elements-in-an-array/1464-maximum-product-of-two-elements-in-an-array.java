class Solution {
    public int maxProduct(int[] nums) {
        int max2=Math.max(nums[0],nums[1]);
        int max1=max2==nums[0]?nums[1]:nums[0];
        for(int i=2;i<nums.length;i++){
            if(nums[i]>max1){
                if(nums[i]>=max2){
                    max1=max2;
                    max2=nums[i];
                }
                else{
                    max1=nums[i];
                }
            }
        }
        return (max1-1)*(max2-1);
    }
}