class Solution {
    
    static int mod = (int)Math.pow(10, 9) + 7;
    
    public int numWays(int steps, int n) {
        
        int[] arr = new int[n];
        if(n <= 1) return n;
        arr[0] = 1;
        arr[1] = 1;
        
        for(int j = 1; j < steps; j++){
            
            int[] temp = new int[n]; 
            
            for(int i = 0; i <= Math.min(n - 1, steps - j); i++){
                long ans = arr[i];
                if(i > 0) ans = (ans + arr[i - 1]) % mod;
                if(i < n - 1) ans = (ans + arr[i + 1]) % mod;
                temp[i] = (int)ans;
            }
            
            arr = temp;
        }
        
        return arr[0];
        
    }
}