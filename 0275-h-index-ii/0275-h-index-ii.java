public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;

        int first = 0;
        int mid;
        int count = len;
        
        while (count > 0) {
            mid = first+count / 2;
           
            if (citations[mid] < len - mid) {
                first = mid + 1;
                count -= (count/2 + 1);
            }
            else {
                count = count/2;
            }
        }
        
        return len - first;
    }
}