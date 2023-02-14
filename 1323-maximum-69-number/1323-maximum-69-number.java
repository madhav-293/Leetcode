class Solution {
    public int maximum69Number (int num) {
        String a=Integer.toString(num);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='6' && i==0){
                a='9'+a.substring(1);
                break;
            }
            else if(a.charAt(i)=='6'){
                a=a.substring(0, i) +'9'+a.substring(i + 1);
                break;
            }
        }
        return Integer.parseInt(a);
    }
}