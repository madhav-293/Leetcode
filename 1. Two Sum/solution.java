class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(hash.containsKey(c))
                return new int[] {hash.get(c),i};
            else
                hash.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
