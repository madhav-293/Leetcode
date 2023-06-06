class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length<3)return true;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(arr[i+1]-arr[i]!=arr[i+2]-arr[i+1])return false;
        }
        return true;
    }
}