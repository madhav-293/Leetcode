class Solution {
    public int removeElement(int[] nums, int val) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            int y=Integer.MAX_VALUE;
            if(nums[i]==val){
                nums[i]=y;;
            }
            else{
                n++;
            }
        }
        Arrays.sort(nums);
        return n;
    }
}