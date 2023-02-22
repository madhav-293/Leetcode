class Solution {
    public int shipWithinDays(int[] a, int days) {
        int l = 0;
        int h = Integer.MAX_VALUE;
        while (l < h) {
            int m = l + (h-l)/2;
            if (isEnough(a, m, days)){
                h = m; 
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }

    
    public boolean isEnough(int[] a, int m, int d) {
        int count = 1;
        int sum = 0;
        for (int w : a) {
            if (w > m){
                return false;
            }
            if ((sum += w) > m) {
                
                if (++count > d){
                    return false;
                } 
                sum = w;
            }
        }
        return true;
    }
}
