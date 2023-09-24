class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k%=n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        
    }
    static void reverse(int[] arr,int s,int d){
        while(s<d){
            int temp=arr[s];
            arr[s]=arr[d];
            arr[d]=temp;
            s++;
            d--;
        }
    }
}