class Solution {
    public int sumOfUnique(int[] nums) {
	// create a new array to hold frequency of each number
	int[] counter = new int[101];
	int sum = 0;
	for (int num : nums) {
		counter[num]++;		// increment count of each num

		if (counter[num] == 1)	// for count == 1, we know its first interaction
			sum += num;			// and we add it to sum. We are adding potential 
								// future duplicates as well

		if (counter[num] == 2)	// for count == 2, we know its a duplicate
			sum -= num;			// and we subtract it (Revert of first step for duplicate). 
								// Now it doesn't affect if count increases to 3,4,5... 
	}
	return sum;
}
}