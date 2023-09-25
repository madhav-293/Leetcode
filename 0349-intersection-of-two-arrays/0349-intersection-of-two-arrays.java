class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int arr[]=new int[nums2.length];
        Arrays.fill(arr,0);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !list.contains(nums1[i]) && arr[j]==0){
                    list.add(nums1[i]);
                    arr[j]=1;
                    break;
                }
            }
        }
        int arr1[]=new int[list.size()];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=list.get(i);
        }
        return arr1;
    }
}