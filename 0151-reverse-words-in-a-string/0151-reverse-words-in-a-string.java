class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String a="";
        ArrayList<String> words=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                a+=s.charAt(i);
            }
            if(s.charAt(i)==' ' && a.length()!=0){
                words.add(a);
                a="";
            }
            
        }
        if(a.length()!=0){
            words.add(a);
        }
        Collections.reverse(words);
        return String.join(" ",words);
    }
}