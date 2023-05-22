class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int v : nums){
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        List<Integer> bucket[] = new ArrayList[nums.length + 1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList();
            }
            bucket[freq].add(key);
        }
        
        int res[] = new int[k];
        int index = 0; // to stop filling res after k length
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int v : bucket[i]){
                    res[index++] = v;
                    if(index == k) return res; // Stop Now
                }
            }
        }
        return res;
    }
}