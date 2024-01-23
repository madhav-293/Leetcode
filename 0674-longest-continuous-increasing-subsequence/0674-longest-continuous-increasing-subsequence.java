class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,maxC=0;
        for(int i=0;i<nums.length-1;i++){
            count=1;
            int j=i;
            while(j<nums.length-1 && nums[j+1]>nums[j]){
                count++;
                j++;
            }
            if(count>maxC){
                maxC=count;
            }
        }
        if(maxC==0) return 1;
        return maxC;
    }
}