class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> l1=new ArrayList();
        List<List<Integer>> l2=new ArrayList();
        comb(k, n, 1, l1, l2);
        return l2;
        
    }
    public static void comb(int k, int n, int f, List<Integer> l1, List<List<Integer>> l2)
    {
        if(k==0 && n==0)
        {
            l2.add(new ArrayList(l1));
            return;
        }
        for(int i=f;i<10;i++)
        {
            l1.add(i);
            comb(k-1, n-i, i+1, l1, l2);
            l1.remove(l1.size()-1);
        }
    }
}