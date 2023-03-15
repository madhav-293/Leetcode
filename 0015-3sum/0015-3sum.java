class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                // if(nums[left]==nums[left+1])
                //     left++;
                // if(nums[right]==nums[right-1])
                //     right++;
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0) set.add(Arrays.asList(nums[i],nums[left++],nums[right]));
                if(sum<0) left++;
                if(sum>0) right--;
            }
        }
        return new ArrayList<>(set);
        
    }
}

