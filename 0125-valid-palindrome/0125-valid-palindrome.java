class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }
        int start=0;
        int l=s.length()-1;
        while(start<=l){
            char a=s.charAt(start);
            char b=s.charAt(l);
            if(!((a>='a' && a<='z') || (a>='0' && a<='9') || (a>='A' && a<='Z'))){
                start++;
            }
            else if(!((b>='a' && b<='z') || (b>='0' && b<='9') || (b>='A' && b<='Z'))){
                l--;
            }
            else{
                if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                    return false;
                }
                start++;
                l--;
            }
        }
        return true;
    }
}