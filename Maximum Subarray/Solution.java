class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length, pre = 0, cur = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i < len; ++i) {
            cur = nums[i];
            if (cur + pre > ans) ans = cur + pre;
            if (cur + pre > 0) pre += cur;
            else if (cur + pre <=0 && cur > 0) pre = cur;
            else pre = 0;
        }
        return ans;
    }
}
