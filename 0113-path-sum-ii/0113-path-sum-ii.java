/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(res,temp,targetSum,root);
        return res;
        
    }
    public static void fun(List<List<Integer>> res,List<Integer> t,int sum,TreeNode root){
        if(root==null) return;
        t.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==sum) 
                res.add(new ArrayList<Integer>(t));
            return;
        }
        if(root.left!=null){
            fun(res,t,sum-root.val,root.left);
            t.remove(t.size()-1);
        }
        if(root.right!=null){
            fun(res,t,sum-root.val,root.right);
            t.remove(t.size()-1);
        }
        
    }
}