class Solution {
    public int[] plusOne(int[] digits) {
        int tmp=0,n=digits.length;
        digits[n-1]+=1;
        if(digits[n-1]>9){
            for(int i=n-1;i>0;i--){
                if(digits[i]>9){
                    tmp=digits[i]/10;
                    digits[i]=digits[i]%10;
                    digits[i-1]+=tmp;
                }
            }
        }
        if(digits[0]>9){
            int arr[]=new int[n+1];
            for(int i=1;i<n+1;i++){
                arr[i]=digits[i-1];
            }
            
            arr[0]=arr[1]/10;
            arr[1]=arr[1]%10;
            return arr;
        }
        return digits;
    }
}