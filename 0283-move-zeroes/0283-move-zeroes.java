class Solution {
    public void moveZeroes(int[] arr) {
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) {
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }
    static void swap(int[] arr,int a1,int a2){
        int temp=arr[a1];
        arr[a1]=arr[a2];
        arr[a2]=temp;
    }
}