class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) { //skip same values at nums[i] to avoid duplicats 
                int l = i + 1;
                int r = n - 1;                
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        results.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        // skip same values to avoid duplicats 
                        while(l < r && nums[l] == nums[l+1]) { 
                            l++;
                        }
                        while(l < r && nums[r] == nums[r-1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (sum < 0) {
                        l++;
                    } else if (sum > 0) {
                        r--;
                    }
                }
            }
        }
        return results;
    }
}