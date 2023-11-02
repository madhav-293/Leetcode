class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                if(nums[i]==nums[i-1]){
                    c+=1;
                    nums[i]+=1;
                }
                else{
                    int a=nums[i-1]-nums[i]+1;
                    c+=a;
                    nums[i]+=a;
                }
                   
            }
        }
        return c;
    }
}