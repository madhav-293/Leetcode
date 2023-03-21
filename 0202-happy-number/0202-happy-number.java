class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            int temp=n;
            n=0;
            while(temp>0){
                n=n+(int)Math.pow((temp%10),2);
                temp/=10;
            }
            if(set.contains(n))
                return false;
            else
                set.add(n);
        }
        return true;
    }
}

