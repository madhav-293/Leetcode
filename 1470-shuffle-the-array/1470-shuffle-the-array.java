class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
        int i=0,j=0;
        while(i<2*n-1){
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
            i+=2;
        }
        return arr;
    }
}