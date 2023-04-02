class Solution {
    public int minSteps(String s, String t) {
        int arr[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0) ans+=arr[i];
        }
        return ans;
    }
}