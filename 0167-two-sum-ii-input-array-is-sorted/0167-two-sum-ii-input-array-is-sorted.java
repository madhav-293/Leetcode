class Solution {
    public int[] twoSum(int[] num, int target) {
    int[] i = new int[2];
    if (num == null || num.length < 2) return i;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int v = num[left] + num[right];
        if (v == target) {
            i[0] = left + 1;
            i[1] = right + 1;
            break;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
    return i;
}
}