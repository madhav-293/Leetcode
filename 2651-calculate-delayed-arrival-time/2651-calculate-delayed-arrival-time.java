class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        return a+d>23?(a+d)%24:a+d;
    }
}