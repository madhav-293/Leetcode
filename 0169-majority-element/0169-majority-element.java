class Solution {
    public int majorityElement(int[] nums) {
        int ans=0,r=0;
        for(int num:nums){
            if(ans==0){
                r=num;
            }
            if(r!=num){
                ans--;
            }
            else{
                ans++;
            }
        }
        return r;
    }
}