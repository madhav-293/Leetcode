class Solution {
    public int majorityElement(int[] nums) {
        int count=0,element=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0) element=nums[i];
            if(element==nums[i]) count++;
            else count--;
        }
        return element;
    }
}