class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int o=0,j=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[o++]=nums[i];
            }else neg[j++]=nums[i];
        }
        o=0;
        for(int i=0;i<n/2;i++){
            nums[o++]=pos[i];
            nums[o++]=neg[i];
        }
        return nums;
    }
}