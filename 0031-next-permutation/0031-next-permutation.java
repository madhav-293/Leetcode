class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1,n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){Arrays.sort(nums);
                   return;}
        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        int i=ind+1;
        int o=n-1;
        while(i<o){
            int temp=nums[i];
            nums[i]=nums[o];
            nums[o]=temp;
            o--;
            i++;
        }
    }
}