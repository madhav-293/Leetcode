class Solution {
      public static String replaceDigits(String s) {

		char[] arr = s.toCharArray();
		for(int i = 1; i<arr.length; i = i + 2) {
		  arr[i] = (char) (arr[i - 1] + arr[i] - '0');
		}
		return String.valueOf(arr);
  }
}