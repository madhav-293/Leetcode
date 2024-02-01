class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i=i+3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }
        }
        int[][] arr=new int[n/3][3];
        int p=0;
        for(int i=0;i<n/3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=nums[p++];
            }
        }
        return arr;
    }
}