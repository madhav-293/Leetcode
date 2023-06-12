class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l=new ArrayList<String>();
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1){
                i++;
            }
            if(s!=nums[i]) l.add(s+"->"+nums[i]);
            else l.add(""+s);
        }
        return l;
    }
}