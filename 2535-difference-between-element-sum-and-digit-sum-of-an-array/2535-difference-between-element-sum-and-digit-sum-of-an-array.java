class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length,s=0,s1=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            int temp=nums[i];
            while(temp>0){
                s1+=temp%10;
                temp/=10;
            }
        }
         return Math.abs(s-s1);
    }
}