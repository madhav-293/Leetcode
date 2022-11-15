class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length - 1;
        int curr = -1;
        int next = 0;
        int ans = 0;
        
        for(int i = 0; next < n; i++){
            if(i > curr){
                ans++;
                curr = next;
            }
            
            next = Math.max(next, nums[i] + i);
        }
        
        return ans;
    }
}
