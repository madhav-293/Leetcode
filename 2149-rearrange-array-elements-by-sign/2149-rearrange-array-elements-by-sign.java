class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int start = 0, end = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                arr[start] = nums[i];
                start += 2;
            }
            else if(nums[i] < 0){
                arr[end] = nums[i];
                end += 2;
            }           
        }
        return arr;
    }
}