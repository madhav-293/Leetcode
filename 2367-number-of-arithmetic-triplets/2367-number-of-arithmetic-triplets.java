class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for( int num : nums){
            set.add(num);
        }
        int ans = 0;
            for( int num : nums){
                if(( set.contains(num + diff ) && set.contains(num + 2 * diff) ) ){
                    ans++;       
                }
            }
        return ans;
            
    }
}