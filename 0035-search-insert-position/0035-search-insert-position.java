class Solution {
    public int searchInsert(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        int mid=(left+right)/2;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                right=mid-1;
            if(nums[mid]<target)
                left=mid+1;
        }
        if(left>right)
            return left;
        return mid;
    }
}