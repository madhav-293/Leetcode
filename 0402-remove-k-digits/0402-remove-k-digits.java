class Solution {
    public String removeKdigits(String num, int k) {
        if(k==0) return num;
        if(k>=num.length()) return "0";
        int count=0; StringBuilder sb=new StringBuilder(); Stack<Integer> stack=new Stack();
        stack.push(Character.getNumericValue(num.charAt(0)));
        for(int i=1;i<num.length();i++){
            if(stack.isEmpty()||stack.peek()<=Character.getNumericValue(num.charAt(i))||count==k)
                stack.push(Character.getNumericValue(num.charAt(i)));
            else{
                stack.pop();
                count++;
                i--;
            }
        }
        while(!stack.isEmpty()) sb.insert(0,stack.pop());
        sb=new StringBuilder(sb.toString().substring(0,num.length()-k));
        while(sb.length()!=0&&sb.charAt(0)=='0') sb.deleteCharAt(0);
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}