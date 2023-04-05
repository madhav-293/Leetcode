class Solution {
    Map<String,String> phone =new HashMap<String,String>(){{
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }};
        List<String> o=new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            backtrack("",digits);
        }
        return o;
    }
    public void backtrack(String com,String next){
        if(next.length()==0){
            o.add(com);
        }
        else{
            String d=next.substring(0,1);
            String l=phone.get(d);
            for(int i=0;i<l.length();i++){
                String le=l.substring(i,i+1);
                backtrack(com+le,next.substring(1));
            }
        }
    }
}