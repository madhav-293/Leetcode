class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hash=new HashSet<>();
        Set<Integer> hash1=new HashSet<>();
        for(int i:nums1){
            hash.add(i);
        }
        for(int i:nums2){
            hash1.add(i);
        }
        List<List<Integer>> l1=new ArrayList<>();
        l1.add(new ArrayList());
        l1.add(new ArrayList());
        for(int i:hash){
            if(!hash1.contains(i)){
                l1.get(0).add(i);
            }
        }
        for(int i:hash1){
            if(!hash.contains(i)){
                l1.get(1).add(i);
            }
        }
        return l1;
    }
}