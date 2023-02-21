class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int k = 0; k < boxes.length(); k++) {
            int i = 0, j = boxes.length()-1;
            int c = 0;
            while(i < k || j > k){
                if(i < k && boxes.charAt(i) == '1') c += k-i;
                if(j > k && boxes.charAt(j) == '1') c += j-k;
                i++;
                j--;
            }
            res[k] = c;
        }
        return res;
    }
}